package AdventureSpil;
import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room north, south, east, west;
    private ArrayList<Items> items;

    public Room (String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();

    }
    public void setExits(Room north, Room south, Room east, Room west) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }
    public Room getNorth() {
        return north;

    }

    public Room getSouth() {
        return south;

    }
    public Room getEast() {
        return east;

    }
    public Room getWest() {
        return west;

    }
    public String getName() {
        return name;

    }
    public String getDescription() {
        return description;

    }
    public Room getExit(String direction) {
        switch (direction.toLowerCase()) {
        case "north": return north;
        case "south": return south;
        case "east": return east;
        case "west": return west;
        default: return null;
    }
    }

    public void addItem(Items item) {
        items.add(item);
    }

    public void removeItem(Items item) {
        items.remove(item);
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public Items findItem(String name) {
        for (Items item : items) {
            if (item.getShortName().equals(name) || item.getLongName().equals(name)) {
                return item;
            }
        }
        return null; // Returner null hvis item ikke findes
    }
}


