# Test Evidence

Owner: Youssef. One table for the whole team (at least 5 cases are required). Collect cases from every member and re-run them before the final submission.

| ID | Owner | What is tested | Input | Expected result | Actual result | Pass/Fail |
|---|---|---|---|---|---|---|
| B1 | Abdullah | BST insert and search | Insert 50,30,70,20,40,60,80; search 60 and 99 | 60 found, 99 not found | | |
| B2 | Abdullah | BST delete with two children | Delete 50 | In-order output still sorted | | |
| D1 | Mohamed | Database save and reload | Save 3 items, restart, load | Same 3 items loaded back | | |
| D2 | Mohamed | Database update | Change an item status, reload | New status stored | | |
| Q1 | Jana | Queue FIFO order | Enqueue A,B,C; dequeue 3 times; dequeue on empty | A,B,C then null | | |
| Q2 | Jana | Claim verification | Submit, reject, submit, verify | Item STORED after reject, RETURNED after verify | | |
| H1 | Rodina | History per item | 5 events for 2 items | Only the right events, in time order | | |
| H2 | Rodina | Full history of one item | Added, claimed, rejected, claimed, returned | 5 events in order | | |
| S1 | Youssef | Sorting | 6 items, mixed dates | Correct order, original unchanged | | |
| S2 | Youssef | Unresolved report | Statuses STORED, CLAIMED, RETURNED, DISPOSED, STORED | Only 3 items shown | | |
| R1 | Farah | Search | Category only; category + keyword; no match | Correct lists, empty list for no match | | |
| R2 | Farah | Possible matches | Missing "blue backpack" | Blue backpack ranked above black phone | | |
| E1 | Mohamed | End to end | Full workflow | Item RETURNED only after verification | | |
