/*
 * Campus Lost and Found System

 * OWNER: Mohamed. Keep the public method names and signatures unchanged. Use PreparedStatement.
 */
package database;

import model.Claim;
import structures.MyList;

public class ClaimDao {
    private final DatabaseManager db;

    public ClaimDao(DatabaseManager db) { this.db = db; }

    /** Insert a new claim row. Return true on success. */
    public boolean saveClaim(Claim claim) {
        // TODO Mohamed
        return false;
    }

    /** Update status, reviewedBy and dateReviewed of an existing claim. Return true on success. */
    public boolean updateClaim(Claim claim) {
        // TODO Mohamed
        return false;
    }

    /** All claims, ordered by claimId (so the oldest comes first). Empty list when none. */
    public MyList<Claim> loadAllClaims() {
        // TODO Mohamed
        return new MyList<Claim>();
    }
}
