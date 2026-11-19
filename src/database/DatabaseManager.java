/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Mohamed (database bonus). Keep the public method names and signatures unchanged.
 * Storage only: searching an item by ID must still use the BST, never an SQL query.
 * SQL is allowed ONLY inside this package (src/database/).
 */
package database;

import java.sql.Connection;

public class DatabaseManager {

    // TODO Mohamed: keep one java.sql.Connection to SQLite (file data/lostfound.db).

    /** Open the database file (create it if missing) and create the tables if they do not exist. */
    public DatabaseManager(String dbPath) {
        // TODO Mohamed: open the connection, then call createTables()
    }

    /** Tables: items, claims, missing_reports, status_events. Use CREATE TABLE IF NOT EXISTS. */
    public void createTables() {
        // TODO Mohamed
    }

    public Connection getConnection() {
        // TODO Mohamed
        return null;
    }

    public void close() {
        // TODO Mohamed
    }
}
