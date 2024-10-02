package AdventureSpil;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }
    public String getUserInput() {
        return scanner.nextLine().toLowerCase();
    }
    public void displayMessage(String message) {
        System.out.println(message);
    }
    public void displayRoomInfo(Room room) {
        // Vis rumbeskrivelse
        displayMessage(room.getDescription());

        // Liste af items i rummet
        ArrayList<Items> itemsInRoom = room.getItems();
        if (itemsInRoom.isEmpty()) {
            displayMessage("There are no items in this room.");
        } else {
            displayMessage("You see the following items:");
            for (Items item : itemsInRoom) {
                displayMessage("- " + item.getLongName());
            }
        }
    }
}










