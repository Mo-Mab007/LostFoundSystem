/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. The ONLY class the GUI and Main talk to.
 * It creates all services, will load data from the database at startup and save after every change.
 */
package service;

import model.Claim;
import model.Item;
import model.ItemStatus;
import model.MissingReport;
import model.StatusEvent;
import structures.MyList;

public class LostFoundSystem {
    private final ItemService itemService = new ItemService();
    private final HistoryService historyService = new HistoryService();
    private final ClaimService claimService = new ClaimService(itemService, historyService);
    private final ReportService reportService = new ReportService(itemService);
    private final MissingReportService missingReportService = new MissingReportService();
    private final SearchService searchService = new SearchService(itemService);

    public LostFoundSystem() {
        // TODO Mohamed: use your own DatabaseManager and DAO classes (src/database/) to open the database
        //              and load items/claims/events/reports into the services
        //              (use addLoadedItem, addLoadedClaim, addLoadedEvent, addLoadedReport, setNextId).
    }

    // ---- Items ----
    public Item addItem(String description, String category, String dateFound, String location, String staffName) {
        Item item = itemService.addItem(description, category, dateFound, location);
        if (item != null) {
            historyService.recordItemAdded(item, staffName);
            // TODO Mohamed: save item and event to the database
        }
        return item;
    }

    public Item findItemById(int itemId) { return itemService.findById(itemId); }

    public MyList<Item> getAllItems() { return itemService.getAllItems(); }

    public boolean updateItemStatus(int itemId, ItemStatus newStatus, String staffName) {
        Item item = itemService.findById(itemId);
        if (item == null) return false;
        ItemStatus old = item.getStatus();
        boolean ok = itemService.changeStatus(itemId, newStatus);
        if (ok) {
            historyService.recordStatusChange(itemId, old, newStatus, staffName, "Manual status change");
            // TODO Mohamed: save to the database
        }
        return ok;
    }

    // ---- Search and matching ----
    public MyList<Item> searchItems(String category, String date, String location, String keyword) {
        return searchService.search(category, date, location, keyword);
    }

    public MyList<Item> getPossibleMatches(MissingReport report) {
        return searchService.getPossibleMatches(report);
    }

    // ---- Missing reports ----
    public MissingReport addMissingReport(String ownerName, String contact, String description,
                                          String category, String approxDate, String location,
                                          String identifyingDetails) {
        MissingReport r = missingReportService.addReport(ownerName, contact, description,
                category, approxDate, location, identifyingDetails);
        // TODO Mohamed: save to the database
        return r;
    }

    public MyList<MissingReport> listMissingReports() { return missingReportService.listReports(); }

    // ---- Claims ----
    public Claim submitClaim(int itemId, String claimantName, String contact, String identifyingDetails) {
        Claim c = claimService.submitClaim(itemId, claimantName, contact, identifyingDetails);
        // TODO Mohamed: save claim, item status and events to the database
        return c;
    }

    public Claim viewNextClaim() { return claimService.viewNextClaim(); }

    public Claim reviewNextClaim(boolean ownershipVerified, String staffName) {
        Claim c = claimService.reviewNextClaim(ownershipVerified, staffName);
        // TODO Mohamed: save claim, item status and events to the database
        return c;
    }

    public MyList<Claim> getPendingClaims() { return claimService.getPendingClaims(); }

    // ---- History and reports ----
    public MyList<StatusEvent> getItemHistory(int itemId) { return historyService.getHistoryForItem(itemId); }

    /** sortBy = "date" or "category". */
    public MyList<Item> getUnresolvedItems(String sortBy) { return reportService.getUnresolvedItems(sortBy); }

    public int[] countByStatus() { return reportService.countByStatus(); }
}
