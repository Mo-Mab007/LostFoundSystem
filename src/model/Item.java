/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Mohamed. Shared class - do NOT edit. Ask Mohamed if you need a change.
 */
package model;

/** An item that was found on campus. Dates are Strings in the format yyyy-MM-dd. */
public class Item {
    private final int itemId;
    private String description;
    private String category;
    private String dateFound;   // yyyy-MM-dd
    private String location;
    private ItemStatus status;

    public Item(int itemId, String description, String category,
                String dateFound, String location, ItemStatus status) {
        this.itemId = itemId;
        this.description = description;
        this.category = category;
        this.dateFound = dateFound;
        this.location = location;
        this.status = status;
    }

    public int getItemId() { return itemId; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public String getDateFound() { return dateFound; }
    public String getLocation() { return location; }
    public ItemStatus getStatus() { return status; }

    public void setDescription(String description) { this.description = description; }
    public void setCategory(String category) { this.category = category; }
    public void setDateFound(String dateFound) { this.dateFound = dateFound; }
    public void setLocation(String location) { this.location = location; }
    public void setStatus(ItemStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Item#" + itemId + " [" + category + "] " + description
                + " | found " + dateFound + " at " + location + " | " + status;
    }
}
