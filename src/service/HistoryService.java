/*
 * Campus Lost and Found System
 *
 * OWNER: Rodina. Keep the public method names and signatures below unchanged.
 * Builds StatusEvent objects and stores them in your HistoryList.
 * Timestamp format: yyyy-MM-dd HH:mm:ss
 */
package service;

import model.Claim;
import model.Item;
import model.ItemStatus;
import model.StatusEvent;
import structures.HistoryList;
import structures.MyList;

public class HistoryService {
    private final HistoryList list = new HistoryList();
    private int nextEventId = 1;

    /** Event ITEM_ADDED for a new item. */
    public void recordItemAdded(Item item, String staffName) {
        // TODO Rodina
    }

    /** Event STATUS_CHANGED with old and new status, who did it, and a note. */
    public void recordStatusChange(int itemId, ItemStatus oldStatus, ItemStatus newStatus,
                                   String actor, String note) {
        // TODO Rodina
    }

    /** Event for a claim action, e.g. action = "CLAIM_SUBMITTED", "CLAIM_VERIFIED", "CLAIM_REJECTED". */
    public void recordClaimAction(Claim claim, String action, String actor) {
        // TODO Rodina
    }

    /** History of one item, oldest first. */
    public MyList<StatusEvent> getHistoryForItem(int itemId) {
        // TODO Rodina
        return new MyList<StatusEvent>();
    }

    /** Every event in the order they were recorded. */
    public MyList<StatusEvent> getAllEvents() {
        // TODO Rodina
        return new MyList<StatusEvent>();
    }

    /** Used by Mohamed at startup: add an event that already has an ID (do not change it). */
    public void addLoadedEvent(StatusEvent event) {
        // TODO Rodina
    }

    public int getNextEventId() { return nextEventId; }

    public void setNextEventId(int nextEventId) { this.nextEventId = nextEventId; }
}
