/*
 * Campus Lost and Found System
 *
 * OWNER: Jana (Queue). Keep the public method names and signatures below unchanged.
 * Replace each TODO with your own implementation (linked nodes, front and rear pointers).
 */
package structures;

import model.Claim;

public class ClaimQueue {

    // TODO Jana: add your own private QueueNode class (claim, next) and front/rear fields.

    /** Add a claim at the rear. */
    public void enqueue(Claim claim) {
        // TODO Jana
    }

    /** Remove and return the oldest claim (front), or null if the queue is empty. */
    public Claim dequeue() {
        // TODO Jana
        return null;
    }

    /** Return the oldest claim without removing it, or null if empty. */
    public Claim peek() {
        // TODO Jana
        return null;
    }

    public boolean isEmpty() {
        // TODO Jana
        return true;
    }

    public int size() {
        // TODO Jana
        return 0;
    }

    /** All claims from front to rear, WITHOUT removing them (for the GUI). */
    public MyList<Claim> toList() {
        // TODO Jana
        return new MyList<Claim>();
    }
}
