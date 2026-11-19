/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Mohamed. Shared class - do NOT edit. Ask Mohamed if you need a change.
 */
package model;

/** One entry in the history of an item (status change or claim action). */
public class StatusEvent {
    private final int eventId;
    private final int itemId;
    private final String timestamp;   // yyyy-MM-dd HH:mm:ss
    private final String actor;       // staff or person who caused the event
    private final String action;      // e.g. ITEM_ADDED, STATUS_CHANGED, CLAIM_SUBMITTED, CLAIM_VERIFIED
    private final String oldStatus;   // may be null/"" for the first event
    private final String newStatus;
    private final String note;

    public StatusEvent(int eventId, int itemId, String timestamp, String actor, String action,
                       String oldStatus, String newStatus, String note) {
        this.eventId = eventId;
        this.itemId = itemId;
        this.timestamp = timestamp;
        this.actor = actor;
        this.action = action;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.note = note;
    }

    public int getEventId() { return eventId; }
    public int getItemId() { return itemId; }
    public String getTimestamp() { return timestamp; }
    public String getActor() { return actor; }
    public String getAction() { return action; }
    public String getOldStatus() { return oldStatus; }
    public String getNewStatus() { return newStatus; }
    public String getNote() { return note; }

    @Override
    public String toString() {
        return "[" + timestamp + "] Item#" + itemId + " " + action + " by " + actor
                + " (" + oldStatus + " -> " + newStatus + ") " + note;
    }
}
