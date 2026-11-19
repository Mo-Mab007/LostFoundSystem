/*
 * Campus Lost and Found System
 *
 * OWNER: Rodina (Linked list). Keep the public method names and signatures below unchanged.
 * Replace each TODO with your own implementation (linked nodes, head and tail pointers).
 */
package structures;

import model.StatusEvent;

public class HistoryList {

    // TODO Rodina: add your own private HistoryNode class (event, next) and head/tail fields.

    /** Add an event at the END of the list (constant time using the tail pointer). */
    public void addEvent(StatusEvent event) {
        // TODO Rodina
    }

    /** All events of one item, oldest first. Empty list if none. */
    public MyList<StatusEvent> getByItemId(int itemId) {
        // TODO Rodina
        return new MyList<StatusEvent>();
    }

    /** All events in the order they were added. */
    public MyList<StatusEvent> getAll() {
        // TODO Rodina
        return new MyList<StatusEvent>();
    }

    public int size() {
        // TODO Rodina
        return 0;
    }
}
