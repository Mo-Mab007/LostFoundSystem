# Campus Lost and Found System (Java)

Team members (fill in):

| Role | Name | ID |
|---|---|---|
| Team leader (database, GUI, integration) | Mohamed Mabrouk | |
| BST and Item Service | Abdullah Ibrahim | |
| Queue and Claim Service | Jana Ibrahim | |
| Linked list, history, design package | Rodina Ayman | |
| Sorting, report, test evidence | Youssef Nasr | |
| Missing reports and search | Farah Tawfik | |

## READ THIS FIRST: rules for everyone

1. **No built-in data structures or algorithms for the required parts.** Do not use `ArrayList`, `LinkedList`, `Queue`, `Stack`, `HashMap`, `TreeMap`, `Collections.sort`, `Arrays.sort`. Write your own nodes and loops. Plain arrays and `String` methods are fine. Use our own `structures.MyList` to return many items.
2. **Edit only your own files** (see the table below). Need a change in someone else's file or in `model/`? Message the owner or Mohamed.
3. **Do not rename** classes, methods, or change signatures. Everyone codes against these names at the same time.
4. **Branches:** work on your own branch (`abdullah-bst`, `jana-queue`, `rodina-history`, `youssef-sort`, `farah-search`). Never push to `main`. Open a pull request and Mohamed merges.
5. **Put all team names and IDs** in the comment at the top of every source file.
6. **No SQL and no Swing code** in the services. Mohamed writes the database code (only inside `src/database/`) and the GUI. Your classes keep data in memory only.
7. **No printing** inside service classes. Return values only.
8. **No copied code or text.** Anything external must be listed in the references.
9. Dates are `String` in the format `yyyy-MM-dd`. IDs are `int`.

## Who owns what

| Owner | Files |
|---|---|
| Mohamed | `src/model/*`, `src/structures/MyList.java`, `src/service/LostFoundSystem.java`, `src/Main.java`, `src/database/*` (DatabaseManager, ItemDao, ClaimDao, MissingReportDao, EventDao), `lib/sqlite-jdbc.jar`, `src/gui/*`, `tests/EndToEndTest.java`, `tests/DatabaseTest.java`, `docs/final_report.*`, `docs/screenshots/` |
| Abdullah | `src/structures/ItemBST.java`, `src/service/ItemService.java`, `tests/BSTTest.java` |
| Jana | `src/structures/ClaimQueue.java`, `src/service/ClaimService.java`, `tests/QueueTest.java` |
| Rodina | `src/structures/HistoryList.java`, `src/service/HistoryService.java`, `tests/HistoryTest.java`, `docs/design_package.md` |
| Youssef | `src/structures/Sorter.java`, `src/service/ReportService.java`, `tests/SortReportTest.java`, `docs/test_evidence.md` |
| Farah | `src/service/MissingReportService.java`, `src/service/SearchService.java`, `tests/SearchTest.java`, `docs/report_sections/requirements.md`, `docs/report_sections/limitations.md` |

Each member also adds a trace file in `docs/traces/` and a report section in `docs/report_sections/` (templates are already there).

## Build and run

Needs a JDK (Java 8 or newer).

```
./build.sh          # Linux / Mac: compiles everything into out/
build.bat           # Windows
java -cp out Main   # run the program
java -cp out BSTTest   # run one test (BSTTest, QueueTest, HistoryTest, SortReportTest, SearchTest, EndToEndTest)
```

Right now every method is a stub (`TODO`) that returns an empty value, so the project already compiles and runs. Replace the TODOs in your own files with your implementation.

## Timeline

- Day 1: Mohamed pushes this skeleton. Everyone clones it and reads it.
- Days 2-5: everyone builds their own part and tests it with their test class.
- Day 6: checkpoint. Merge first versions and run the full flow together.
- Days 7-9: fixes, tests, traces, report sections.
- Day 10: final merge and demo rehearsal. Everyone explains their own part out loud.

## Folder tree

```
LostFoundSystem/
├── README.md
├── build.sh, build.bat
├── lib/                    (sqlite-jdbc.jar goes here - Mohamed)
├── data/                   (lostfound.db is created at first run)
├── src/
│   ├── Main.java
│   ├── model/              Item, Claim, MissingReport, StatusEvent, ItemStatus, ClaimStatus
│   ├── structures/         MyList, ItemBST, ClaimQueue, HistoryList, Sorter
│   ├── service/            LostFoundSystem, ItemService, ClaimService, HistoryService,
│   │                       ReportService, MissingReportService, SearchService
│   ├── database/           DatabaseManager, ItemDao, ClaimDao, MissingReportDao, EventDao (Mohamed)
│   └── gui/                MainWindow (+ panels)
├── tests/                  BSTTest, QueueTest, HistoryTest, SortReportTest, SearchTest, EndToEndTest, DatabaseTest
└── docs/
    ├── design_package.md
    ├── test_evidence.md
    ├── traces/
    ├── report_sections/
    └── screenshots/
```
