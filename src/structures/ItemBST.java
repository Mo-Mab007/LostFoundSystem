/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Abdullah (BST). Keep the public method names and signatures below unchanged.
 * Replace each TODO with your own implementation (own node class, no built-in structures).
 */
package structures;

import model.Item;

public class ItemBST {

    // TODO Abdullah: add your own private BSTNode class (item, left, right) and a root field.

    /** Insert by itemId. Return false (and do not insert) if the ID already exists. */
    public boolean insert(Item item) {
        // TODO Abdullah
        return false;
    }

    /** Return the item with this ID, or null if not found. */
    public Item search(int itemId) {
        // TODO Abdullah
        return null;
    }

    /** Delete by ID. Handle leaf, one child, two children (in-order successor). Return true if deleted. */
    public boolean delete(int itemId) {
        // TODO Abdullah
        return false;
    }

    /** All items sorted by itemId (in-order traversal). */
    public MyList<Item> inOrder() {
        // TODO Abdullah
        return new MyList<Item>();
    }

    public int size() {
        // TODO Abdullah
        return 0;
    }
}
