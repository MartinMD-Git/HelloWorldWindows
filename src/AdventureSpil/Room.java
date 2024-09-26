package AdventureSpil;

public class Room {
    private String name;
    private String description;
    private Room north, south, east, west;

    public Room (String name, String description) {
        this.name = name;
        this.description = description;

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

}
