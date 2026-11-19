/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Farah. Keep the public method names and signatures below unchanged.
 * Uses ItemService.getAllItems(). No built-in sort or list for the required parts.
 */
package service;

import model.Item;
import model.MissingReport;
import structures.MyList;

public class SearchService {
    private final ItemService itemService;

    public SearchService(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * Search stored items. Any argument that is null or empty is ignored.
     * Not case-sensitive. The keyword is looked for inside the description.
     * Returns an empty list (never null) when nothing matches.
     */
    public MyList<Item> search(String category, String date, String location, String keyword) {
        // TODO Farah
        return new MyList<Item>();
    }

    /**
     * Possible matches for staff to review (NOT automatic matching, nothing is changed).
     * Score: +2 same category, +1 similar location word, +1 per shared keyword in the
     * descriptions, +1 if found on or after the lost date. Return items with score > 0, highest first.
     */
    public MyList<Item> getPossibleMatches(MissingReport report) {
        // TODO Farah
        return new MyList<Item>();
    }
}
