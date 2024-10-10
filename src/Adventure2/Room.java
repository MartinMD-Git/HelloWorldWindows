package Adventure2;

import java.util.ArrayList;
import java.util.List;

public class Room {

    // Her er koden til at samle ting op.
    public Item takeItem(String itemName) {
        for (Item item : items) { // Denne kode gør at der bliver tjekket igennem ArrayLists for items.
            if (item.getItemName().equalsIgnoreCase(itemName)) { // Denne kode gør, at hvis der er noget der matcher det item name som man skriver ind, så samler man det op. (Hvis man skriver take først).
                items.remove(item); // Denne kode fjerner et item fra Listen, hvis man tager det op.
                return item;
            }
        }
        return null; // Hvis man skriver et item ind, der ikke findes, så kommer den tilbage som null.

    }

    private int roomNumber;
    private String roomDescription;

    private Room n;
    private Room s;
    private Room w;
    private Room e;
    private List<Item> items;
    private List<Enemy> enemies;

    public Room(int roomNumber, String roomDescription) {
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.items = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Room getN() {
        return n;
    }

    public void setN(Room n) {
        this.n = n;
    }

    public Room getS() {
        return s;
    }

    public void setS(Room s) {
        this.s = s;
    }

    public Room getW() {
        return w;
    }

    public void setW(Room w) {
        this.w = w;
    }

    public Room getE() {
        return e;
    }

    public void setE(Room e) {
        this.e = e;

    }

    @Override
    public String toString() {

        return "Room " + roomNumber + ": " + roomDescription + "\nItems in this room: " + items +
                "\nEnemies in this room: " + enemies;

    }

    public void dropItem(Item itemToDrop) {
        items.add(itemToDrop);
    }
    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }
    public Enemy getNearestEnemy() {
        if (enemies.isEmpty()) {
            return null;
        } else {
            return enemies.get(0);
        }

    }
}