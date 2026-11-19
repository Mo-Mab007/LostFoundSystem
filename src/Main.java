/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. Entry point of the program.
 */
import service.LostFoundSystem;

public class Main {
    public static void main(String[] args) {
        LostFoundSystem system = new LostFoundSystem();
        System.out.println("Campus Lost and Found System - skeleton OK");
        System.out.println("Items stored: " + system.getAllItems().size());
        // TODO Mohamed: console menu first, then open gui.MainWindow
    }
}
