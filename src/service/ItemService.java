/*
 * Campus Lost and Found System
 *
 * OWNER: Abdullah. Keep the public method names and signatures below unchanged.
 * Uses your ItemBST. Do not print anything here, and no database code.
 */
package service;

import model.Item;
import model.ItemStatus;
import structures.ItemBST;
import structures.MyList;

public class ItemService {
    private final ItemBST tree = new ItemBST();
    private int nextId = 1;

    /** Create a new item with the next ID and status STORED, insert it in the tree, return it. */
    public Item addItem(String description, String category, String dateFound, String location) {
        // TODO Abdullah
        return null;
    }

    /** Return the item or null. Must use the BST (not a loop over all items). */
    public Item findById(int itemId) {
        // TODO Abdullah
        return null;
    }

    /** Change the status of an item. Return false if the item does not exist. */
    public boolean changeStatus(int itemId, ItemStatus newStatus) {
        // TODO Abdullah
        return false;
    }

    /** All items sorted by ID (BST in-order). */
    public MyList<Item> getAllItems() {
        // TODO Abdullah
        return new MyList<Item>();
    }

    /** Used by Mohamed at startup: insert an item that already has an ID (do not change its ID). */
    public boolean addLoadedItem(Item item) {
        // TODO Abdullah
        return false;
    }

    public int getNextId() { return nextId; }

    public void setNextId(int nextId) { this.nextId = nextId; }
}
