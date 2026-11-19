/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. Keep the public method names and signatures unchanged. Use PreparedStatement.
 */
package database;

import model.MissingReport;
import structures.MyList;

public class MissingReportDao {
    private final DatabaseManager db;

    public MissingReportDao(DatabaseManager db) { this.db = db; }

    /** Insert a new missing-report row. Return true on success. */
    public boolean saveReport(MissingReport report) {
        // TODO Mohamed
        return false;
    }

    /** All reports, ordered by reportId. Empty list when none. */
    public MyList<MissingReport> loadAllReports() {
        // TODO Mohamed
        return new MyList<MissingReport>();
    }
}
