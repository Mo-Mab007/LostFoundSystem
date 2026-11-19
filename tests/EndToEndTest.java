/*
 * Campus Lost and Found System
 * Team members (fill in): Mohamed Mabrouk - [ID] | Abdullah Ibrahim - [ID] | Jana Ibrahim - [ID]
 *                         Rodina Ayman - [ID] | Youssef Nasr - [ID] | Farah Tawfik - [ID]
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
