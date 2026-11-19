/*
 * Campus Lost and Found System
 *
 * OWNER: Youssef. Keep the public method names and signatures below unchanged.
 * Uses ItemService.getAllItems() and your Sorter.
 */
package service;

import model.Item;
import structures.MyList;

public class ReportService {
    private final ItemService itemService;

    public ReportService(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * Items that are still unresolved (status STORED or CLAIMED only), sorted by
     * sortBy = "date" (date found, oldest first) or "category" (alphabetical).
     */
    public MyList<Item> getUnresolvedItems(String sortBy) {
        // TODO Youssef
        return new MyList<Item>();
    }

    /**
     * Number of items per status. Index = ItemStatus.ordinal()
     * (0 = STORED, 1 = CLAIMED, 2 = DISPOSED, 3 = RETURNED).
     */
    public int[] countByStatus() {
        // TODO Youssef
        return new int[4];
    }
}
