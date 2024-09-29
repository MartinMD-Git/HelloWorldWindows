package AdventureSpil;

public class Player {
    private Room currentRoom;

    public Player(Room startRoom) {
        this.currentRoom = startRoom;
}
    public void move(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("You cannot go that way.");
        } else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getDescription());
        }
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
}
