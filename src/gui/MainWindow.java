/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed (GUI bonus). The GUI calls ONLY service.LostFoundSystem. No logic or SQL here.
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import service.LostFoundSystem;

public class MainWindow extends JFrame {

    public MainWindow(LostFoundSystem system) {
        super("Campus Lost and Found System");
        JTabbedPane tabs = new JTabbedPane();
        // TODO Mohamed: replace these placeholders with ItemsPanel, MissingReportsPanel, ClaimsPanel, ReportsPanel
        tabs.addTab("Items", new JLabel("Items - TODO"));
        tabs.addTab("Missing Reports", new JLabel("Missing Reports - TODO"));
        tabs.addTab("Claims", new JLabel("Claims - TODO"));
        tabs.addTab("Reports", new JLabel("Reports - TODO"));
        add(tabs);
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
