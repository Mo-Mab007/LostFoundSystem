/*
 * Campus Lost and Found System
 *
 * OWNER: Jana. Console test for ClaimQueue / ClaimService. Print TEST ID, expected, actual, PASS/FAIL.
 */
import structures.ClaimQueue;

public class QueueTest {
    public static void main(String[] args) {
        ClaimQueue queue = new ClaimQueue();
        // TODO Jana:
        //  Test Q1: enqueue A,B,C -> dequeue x3 gives A,B,C; dequeue on empty gives null
        //  Test Q2: submit a claim, reject it (item back to STORED), submit again, verify (item RETURNED)
        System.out.println("QueueTest: TODO (queue empty = " + queue.isEmpty() + ")");
    }
}
