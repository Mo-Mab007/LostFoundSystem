/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Mohamed. Console test for the database package. Print TEST ID, expected, actual, PASS/FAIL.
 */
import database.DatabaseManager;
import database.ItemDao;

public class DatabaseTest {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager("data/test.db");
        ItemDao items = new ItemDao(db);
        // TODO Mohamed:
        //  Test D1: save 3 items, close, open the database again -> loadAllItems returns the same 3 items
        //  Test D2: update an item status, reload -> the new status is stored
        //  Test D3: save a claim, a missing report and an event -> they load back correctly
        System.out.println("DatabaseTest: TODO (items loaded = " + items.loadAllItems().size() + ")");
        db.close();
    }
}
