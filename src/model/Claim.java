/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Mohamed. Shared class - do NOT edit. Ask Mohamed if you need a change.
 */
package model;

/** A person's claim on a stored item. Waits in the claim queue until staff review it. */
public class Claim {
    private final int claimId;
    private final int itemId;
    private String claimantName;
    private String contact;
    private String identifyingDetails;
    private String dateSubmitted;   // yyyy-MM-dd
    private ClaimStatus status;
    private String reviewedBy;      // staff name, null until reviewed
    private String dateReviewed;    // yyyy-MM-dd, null until reviewed

    public Claim(int claimId, int itemId, String claimantName, String contact,
                 String identifyingDetails, String dateSubmitted, ClaimStatus status) {
        this.claimId = claimId;
        this.itemId = itemId;
        this.claimantName = claimantName;
        this.contact = contact;
        this.identifyingDetails = identifyingDetails;
        this.dateSubmitted = dateSubmitted;
        this.status = status;
    }

    public int getClaimId() { return claimId; }
    public int getItemId() { return itemId; }
    public String getClaimantName() { return claimantName; }
    public String getContact() { return contact; }
    public String getIdentifyingDetails() { return identifyingDetails; }
    public String getDateSubmitted() { return dateSubmitted; }
    public ClaimStatus getStatus() { return status; }
    public String getReviewedBy() { return reviewedBy; }
    public String getDateReviewed() { return dateReviewed; }

    public void setStatus(ClaimStatus status) { this.status = status; }
    public void setReviewedBy(String reviewedBy) { this.reviewedBy = reviewedBy; }
    public void setDateReviewed(String dateReviewed) { this.dateReviewed = dateReviewed; }

    @Override
    public String toString() {
        return "Claim#" + claimId + " on Item#" + itemId + " by " + claimantName
                + " (" + contact + ") | " + status;
    }
}
