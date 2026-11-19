/*
 * Campus Lost and Found System
 *
 * OWNER: Abdullah. Console test for ItemBST / ItemService. Print TEST ID, expected, actual, PASS/FAIL.
 */
import model.Item;
import model.ItemStatus;
import structures.ItemBST;

public class BSTTest {
    public static void main(String[] args) {
        ItemBST tree = new ItemBST();
        // TODO Abdullah:
        //  Test B1: insert 50,30,70,20,40,60,80 -> search(60) found, search(99) null
        //  Test B2: delete a node with two children (50) -> inOrder() still sorted
        System.out.println("BSTTest: TODO (tree size = " + tree.size() + ")");
    }
}
