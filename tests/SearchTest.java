/*
 * Campus Lost and Found System
 *
 * OWNER: Farah. Console test for SearchService / MissingReportService. Print TEST ID, expected, actual, PASS/FAIL.
 */
import service.ItemService;
import service.SearchService;

public class SearchTest {
    public static void main(String[] args) {
        ItemService items = new ItemService();
        SearchService search = new SearchService(items);
        // TODO Farah:
        //  Test R1: search by category only, category + keyword, keyword that matches nothing (empty list)
        //  Test R2: missing report "blue backpack" ranks the stored blue backpack above a black phone
        System.out.println("SearchTest: TODO (empty search size = " + search.search("", "", "", "").size() + ")");
    }
}
