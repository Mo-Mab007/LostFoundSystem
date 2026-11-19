/*
 * Campus Lost and Found System
 *
 * OWNER: Youssef. Console test for Sorter / ReportService. Print TEST ID, expected, actual, PASS/FAIL.
 */
import model.Item;
import structures.MyList;
import structures.Sorter;

public class SortReportTest {
    public static void main(String[] args) {
        MyList<Item> items = new MyList<Item>();
        MyList<Item> sorted = Sorter.sortByDateFound(items);
        // TODO Youssef:
        //  Test S1: sort 6 items (two with equal dates) by date and by category; original list unchanged
        //  Test S2: statuses STORED, CLAIMED, RETURNED, DISPOSED, STORED -> report shows only 3 items
        System.out.println("SortReportTest: TODO (sorted size = " + sorted.size() + ")");
    }
}
