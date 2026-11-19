/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Mohamed. Keep the public method names and signatures unchanged. Use PreparedStatement.
 */
package database;

import model.StatusEvent;
import structures.MyList;

public class EventDao {
    private final DatabaseManager db;

    public EventDao(DatabaseManager db) { this.db = db; }

    /** Insert a new history event row. Return true on success. */
    public boolean saveEvent(StatusEvent event) {
        // TODO Mohamed
        return false;
    }

    /** All events, ordered by eventId (the order they happened). Empty list when none. */
    public MyList<StatusEvent> loadAllEvents() {
        // TODO Mohamed
        return new MyList<StatusEvent>();
    }
}
