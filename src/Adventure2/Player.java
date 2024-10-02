package Adventure2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {


    private Room currentRoom;
    private ArrayList<Item> itemArrayList;

    public Player(Room firstRoom) {

        this.currentRoom = firstRoom;
        this.itemArrayList = new ArrayList<>();
    }

    public void getS() {
        if (currentRoom.getS() != null) {
            currentRoom = currentRoom.getS();
        } else {
            System.out.println("Unfortunately, a wall is blocking the way.");
        }
    }

    public void getN() {
        if (currentRoom.getN() != null) {
            currentRoom = currentRoom.getN();
        } else {
            System.out.println("Unfortunately, a wall is blocking the way.");
        }
    }


    public void getE() {
        if (currentRoom.getE() != null) {
            currentRoom = currentRoom.getE();
        } else {
            System.out.println("Unfortunately, a wall is blocking the way.");
        }

    }

    public void getW() {
        if (currentRoom.getW() != null) {
            currentRoom = currentRoom.getW();
        } else {
            System.out.println("Unfortunately, a wall is blocking the way.");

        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void addItemToInventory(Item item) {
        itemArrayList.add(item);
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }
}
