/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. Shared class - do NOT edit.
 */
package model;

/** A report from a person who lost something. */
public class MissingReport {
    private final int reportId;
    private String ownerName;
    private String contact;
    private String description;
    private String category;
    private String approxDate;          // yyyy-MM-dd, approximate date lost
    private String location;            // approximate place lost
    private String identifyingDetails;  // marks, colour, brand, contents, ...

    public MissingReport(int reportId, String ownerName, String contact, String description,
                         String category, String approxDate, String location,
                         String identifyingDetails) {
        this.reportId = reportId;
        this.ownerName = ownerName;
        this.contact = contact;
        this.description = description;
        this.category = category;
        this.approxDate = approxDate;
        this.location = location;
        this.identifyingDetails = identifyingDetails;
    }

    public int getReportId() { return reportId; }
    public String getOwnerName() { return ownerName; }
    public String getContact() { return contact; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public String getApproxDate() { return approxDate; }
    public String getLocation() { return location; }
    public String getIdentifyingDetails() { return identifyingDetails; }

    @Override
    public String toString() {
        return "MissingReport#" + reportId + " by " + ownerName + " [" + category + "] "
                + description + " | lost ~" + approxDate + " near " + location;
    }
}
