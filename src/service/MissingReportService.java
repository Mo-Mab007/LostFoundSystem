/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Farah. Keep the public method names and signatures below unchanged.
 * Store the reports in your own linked structure or MyList (no ArrayList).
 */
package service;

import model.MissingReport;
import structures.MyList;

public class MissingReportService {
    private int nextId = 1;

    /** Create a report with the next ID, store it, return it. */
    public MissingReport addReport(String ownerName, String contact, String description,
                                   String category, String approxDate, String location,
                                   String identifyingDetails) {
        // TODO Farah
        return null;
    }

    /** All reports in the order they were added. */
    public MyList<MissingReport> listReports() {
        // TODO Farah
        return new MyList<MissingReport>();
    }

    /** The report with this ID, or null. */
    public MissingReport findReportById(int reportId) {
        // TODO Farah
        return null;
    }

    /** Used by Mohamed at startup: store a report that already has an ID (do not change it). */
    public void addLoadedReport(MissingReport report) {
        // TODO Farah
    }

    public int getNextId() { return nextId; }

    public void setNextId(int nextId) { this.nextId = nextId; }
}
