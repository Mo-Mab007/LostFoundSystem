# Campus Lost and Found System (Java)

Team members :

| Role | Name | ID |
|---|---|---|
| database, GUI, integration | Mohamed Mabrouk | |
| BST and Item Service | Abdullah Ibrahim | |
| Queue and Claim Service | Jana Ibrahim | |
| Linked list, history, design package | Rodina Ayman | |
| Sorting, report, test evidence | Youssef Nasr | |
| Missing reports and search | Farah Tawfik | |

| Member | Files |
|---|---|
| Mohamed | `src/model/*`, `src/structures/MyList.java`, `src/service/LostFoundSystem.java`, `src/Main.java`, `src/database/*` (DatabaseManager, ItemDao, ClaimDao, MissingReportDao, EventDao), `lib/sqlite-jdbc.jar`, `src/gui/*`, `tests/EndToEndTest.java`, `tests/DatabaseTest.java`, `docs/final_report.*`, `docs/screenshots/` |
| Abdullah | `src/structures/ItemBST.java`, `src/service/ItemService.java`, `tests/BSTTest.java` |
| Jana | `src/structures/ClaimQueue.java`, `src/service/ClaimService.java`, `tests/QueueTest.java` |
| Rodina | `src/structures/HistoryList.java`, `src/service/HistoryService.java`, `tests/HistoryTest.java`, `docs/design_package.md` |
| Youssef | `src/structures/Sorter.java`, `src/service/ReportService.java`, `tests/SortReportTest.java`, `docs/test_evidence.md` |
| Farah | `src/service/MissingReportService.java`, `src/service/SearchService.java`, `tests/SearchTest.java`, `docs/report_sections/requirements.md`, `docs/report_sections/limitations.md` |

Each member also adds a trace file in `docs/traces/` and a report section in `docs/report_sections/` (templates are already there).

every method is a stub (`TODO`) that returns an empty value, so the project already compiles and runs. Replace the TODOs in your own files with your implementation.

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
