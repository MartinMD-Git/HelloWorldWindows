package Adventure2;

public class Map {

    private Room current;

    public Room getRoom() {
        return current;
    }

    public Map() {
        this.createMap();
    }

    public void createMap() {

        Room room1 = new Room(1, "There are 2 doors. Take a look around to see if there is anything you can use.");
        Room room2 = new Room(2, "There are 2 doors in this room.  ");
        Room room3 = new Room(3, "There are 2 doors. ");
        Room room4 = new Room(4, "There are 2 doors ");
        Room room5 = new Room(5, "There is 1 door, the one you just came from");
        Room room6 = new Room(6, "There are 2 doors. ");
        Room room7 = new Room(7, "There are 2 doors. ");
        Room room8 = new Room(8, "There are 3 doors. ");
        Room room9 = new Room(9, "There are 2 doors.");

        // Her laver jeg nogle items.
        Item coffee = new Item("Coffee", "A scolden hot coffee");
        Item flashlight = new Item("Flashlight", "A bright lamp");

        Food apple = new Food("Apple", "Big red apple", 10);
        Food deadRabbit = new Food("rabbit", "Not a lot of skin is left, but you can see that it is a rabbit", -90);

        // Her tildeler jeg mad i de rum de skal være i.
        room1.addItem(apple);
        room2.addItem(deadRabbit);

        // Her tildeler jeg mine items et rum de skal være i.
        room1.addItem(flashlight);
        room1.addItem(coffee);

        // Våben
        room1.addItem(new RangedWeapon("Bow", "A long-range bow.", 5, 10));
        room1.addItem(new MeleeWeapon("Sword", "A sharp sword.", 5));

        //Enemies
        Enemy skeleton = new Enemy("Skeleton", "A skeleton.", 10, new MeleeWeapon("Axe", "A big axe", 3), room1);
        room1.addEnemy(skeleton);

        room1.setN(null);
        room1.setE(room2);
        room1.setS(room4);
        room1.setW(null);

        room2.setN(null);
        room2.setE(room3);
        room2.setS(null);
        room2.setW(room1);

        room3.setN(null);
        room3.setE(null);
        room3.setS(room6);
        room3.setW(room2);

        room4.setN(room1);
        room4.setE(null);
        room4.setS(room7);
        room4.setW(null);

        room5.setN(null);
        room5.setE(null);
        room5.setS(room8);
        room5.setW(null);

        room6.setN(room3);
        room6.setE(null);
        room6.setS(room9);
        room6.setW(null);

        room7.setN(room4);
        room7.setE(room8);
        room7.setS(null);
        room7.setW(null);

        room8.setN(room5);
        room8.setE(room9);
        room8.setS(null);
        room8.setW(room7);

        room9.setN(room6);
        room9.setE(null);
        room9.setS(null);
        room9.setW(room8);

        current = room1;

    }

}