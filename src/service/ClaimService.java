/*
 * Campus Lost and Found System
 *
 * OWNER: Jana. Keep the public method names and signatures below unchanged.
 * Uses your ClaimQueue, Abdullah's ItemService and Rodina's HistoryService.
 * RULE: an item becomes RETURNED only inside reviewNextClaim, and only if ownership was verified.
 */
package service;

import model.Claim;
import structures.ClaimQueue;
import structures.MyList;

public class ClaimService {
    private final ClaimQueue queue = new ClaimQueue();
    private final ItemService itemService;
    private final HistoryService historyService;
    private int nextId = 1;

    public ClaimService(ItemService itemService, HistoryService historyService) {
        this.itemService = itemService;
        this.historyService = historyService;
    }

    /**
     * Check the item exists and is STORED, create a PENDING claim, enqueue it,
     * set the item to CLAIMED, record history. Return the claim, or null if not allowed.
     */
    public Claim submitClaim(int itemId, String claimantName, String contact, String identifyingDetails) {
        // TODO Jana
        return null;
    }

    /** The oldest pending claim, WITHOUT removing it (so staff can compare it with the item). Null if none. */
    public Claim viewNextClaim() {
        // TODO Jana
        return null;
    }

    /**
     * Dequeue the OLDEST claim. If ownershipVerified: claim VERIFIED, item RETURNED.
     * Otherwise: claim REJECTED, item back to STORED. Record history. Return the reviewed claim, or null if none.
     */
    public Claim reviewNextClaim(boolean ownershipVerified, String staffName) {
        // TODO Jana
        return null;
    }

    /** All pending claims, oldest first, without removing them. */
    public MyList<Claim> getPendingClaims() {
        // TODO Jana
        return new MyList<Claim>();
    }

    /** Used by Mohamed at startup: enqueue a claim that already has an ID (do not change its ID). */
    public void addLoadedClaim(Claim claim) {
        // TODO Jana
    }

    public int getNextId() { return nextId; }

    public void setNextId(int nextId) { this.nextId = nextId; }
}
