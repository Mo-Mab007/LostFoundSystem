/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. Keep the public method names and signatures unchanged. Use PreparedStatement.
 */
package database;

import model.Item;
import structures.MyList;

public class ItemDao {
    private final DatabaseManager db;

    public ItemDao(DatabaseManager db) { this.db = db; }

    /** Insert a new item row. Return true on success. */
    public boolean saveItem(Item item) {
        // TODO Mohamed
        return false;
    }

    /** Update the row of an existing item (status, description, ...). Return true on success. */
    public boolean updateItem(Item item) {
        // TODO Mohamed
        return false;
    }

    /** Delete the row with this ID. Return true on success. */
    public boolean deleteItem(int itemId) {
        // TODO Mohamed
        return false;
    }

    /** All items, ordered by itemId. Empty list (never null) when there are none. */
    public MyList<Item> loadAllItems() {
        // TODO Mohamed
        return new MyList<Item>();
    }
}
