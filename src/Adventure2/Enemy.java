package Adventure2;

class Enemy {
    private String name;
    private String description;
    private int health;
    private Weapon weapon;
    private Room currentRoom; // Enemy always has one weapon equipped

    public Enemy(String name, String description, int health, Weapon weapon, Room room) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.currentRoom = room;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void hit(Weapon playerWeapon) {
        // Reducerer liv ud fra weapon damage
        health -= playerWeapon.getDamage(); // Assuming weapon has a getDamage() method

        // Ser om enemy er død
        if (health <= 0) {
            System.out.println(name + " is dead. They dropped a " + weapon.getItemName());
            dropWeapon();
        } else {
            System.out.println(name + " now has " + health + " health left.");
        }
    }

    public void attack(Player player) {
        // Enemy angreb
        if (weapon.canUse()) {
            System.out.println(name + " attacks you with " + weapon.getItemName());
            player.reduceHealth(weapon.getDamage());  // Assuming player has a reduceHealth() method
        } else {
            System.out.println(name + " tries to attack, but the weapon is out of uses!");
        }
    }

    public void dropWeapon() {
        // Tilføjer det droppede våben til room
        currentRoom.addItem(weapon);  // Assuming currentRoom is the room the enemy is in
    }

    public boolean isDead() {
        return health <= 0;
    }
    @Override
    public String toString(){
        return name + " (Health: " + health + ")";
    }
}
