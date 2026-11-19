# Design Package

Owner: Rodina. Collect the details from each member and ask them to check what you wrote about their part.

## 1. Modules and classes
(Class/module diagram: packages model, structures, service, database, gui, and which class calls which.)

## 2. Data structures

| Structure | Class | Where it is used | Why chosen | Main operations and complexity |
|---|---|---|---|---|
| Binary search tree | ItemBST | Item records by item ID | | insert, search, delete, in-order |
| Queue (linked) | ClaimQueue | Claims waiting for staff review (FIFO) | | enqueue, dequeue, peek |
| Linked list | HistoryList | Claim and status history | | addEvent (tail), getByItemId |
| Sorting (merge sort) | Sorter | Items by date found / category | | sortByDateFound, sortByCategory |
| Growable list | MyList | Returning many results | | add, get, size |

## 3. Key operations
(Table of the main operations of each service and what they call.)

## 4. Data flow of the main workflow
(Add item, report missing, search, claim, review, return, report.)
