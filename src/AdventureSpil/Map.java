package AdventureSpil;

public class Map {
    private Room startingRoom;

    public Map(){
        buildMap();
    }
    private void buildMap() {

        Room room1 = new Room("AdventureSpil.Room 1", "room 1");
        Room room2 = new Room("AdventureSpil.Room 2", "You are  in room 2");
        Room room3 = new Room("AdventureSpil.Room 3", "room 3");
        Room room4 = new Room("AdventureSpil.Room 4", "room 4");
        Room room5 = new Room("AdventureSpil.Room 5", "room 5");
        Room room6 = new Room("AdventureSpil.Room 6", "room 6");
        Room room7 = new Room("AdventureSpil.Room 7", "room 7");
        Room room8 = new Room("AdventureSpil.Room 8", "room 8");
        Room room9 = new Room("AdventureSpil.Room 9", "room 9");

        room1.setExits(null, room4, room2, null);
        room2.setExits(null, null, room3, room1);
        room3.setExits(null, room6, null, room2);
        room4.setExits(room1, room7, null, null);
        room5.setExits(null, room8, null, null);
        room6.setExits(room3, room9, null, null);
        room7.setExits(room4, null, room8, null);
        room8.setExits(room5, null, room9, room7);
        room9.setExits(room6, null, null, room8);

        startingRoom = room1;


    }
    public Room getStartingRoom() {
        return startingRoom;
    }
}