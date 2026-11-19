/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
 *
 * OWNER: Mohamed. Shared class - do NOT edit. Ask Mohamed if you need a change.
 */
package model;

/** Status of a found item. RETURNED may only be set after a claim is verified. */
public enum ItemStatus {
    STORED, CLAIMED, DISPOSED, RETURNED
}
