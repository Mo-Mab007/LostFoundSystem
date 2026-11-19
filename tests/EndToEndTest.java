/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. Full workflow through LostFoundSystem.
 */
import service.LostFoundSystem;

public class EndToEndTest {
    public static void main(String[] args) {
        LostFoundSystem system = new LostFoundSystem();
        // TODO Mohamed: add item -> report missing -> search -> claim -> reject -> claim again
        //              -> verify -> item RETURNED -> check history and unresolved report
        System.out.println("EndToEndTest: TODO (items = " + system.getAllItems().size() + ")");
    }
}
