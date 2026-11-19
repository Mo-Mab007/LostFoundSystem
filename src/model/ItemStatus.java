/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. Shared class - do NOT edit. 
 */
package model;

/** Status of a found item. RETURNED may only be set after a claim is verified. */
public enum ItemStatus {
    STORED, CLAIMED, DISPOSED, RETURNED
}
