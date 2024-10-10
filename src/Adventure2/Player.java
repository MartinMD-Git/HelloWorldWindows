package Adventure2;

import java.util.ArrayList;
import java.util.List;

public class Player {

    //Health og mad
    private int playerHealth = 100;
    private Room currentRoom;
    private ArrayList<Item> itemArrayList;
    private Weapon equippedWeapon;


    public enum FoodStatus {
        GOOD,
        BAD,
        NOT_FOOD
    }

    public int getPlayerHealth() {
        return playerHealth;
    }
    public FoodStatus eat(String foodName) {
        for (Item item : itemArrayList) {
            if (item instanceof Food && item.getItemName().equalsIgnoreCase(foodName)) {
                Food food = (Food) item;
                playerHealth += food.getHealthPoints();
                itemArrayList.remove(item);  // Remove from inventory

                if (food.getHealthPoints() > 0) {
                    return FoodStatus.GOOD;
                } else {
                    return FoodStatus.BAD;
                }
            }
        }

        for (Item item : currentRoom.getItems()) {
            if (item instanceof Food && item.getItemName().equalsIgnoreCase(foodName)) {
                Food food = (Food) item;
                playerHealth += food.getHealthPoints();
                currentRoom.getItems().remove(item);  // Remove from room

                if (food.getHealthPoints() > 0) {
                    return FoodStatus.GOOD;
                } else {
                    return FoodStatus.BAD;
                }
            }
        }

        return FoodStatus.NOT_FOOD;
    }



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
    public String getHealthStatus() {
        String status;
        if (playerHealth == 100) {
            status = "You are in perfect health!";
        } else if (playerHealth >= 75) {
            status = "You are in good health, but avoid fighting right now.";
        } else if (playerHealth >= 50) {
            status = "You are injured but can continue.";
        } else if (playerHealth >= 25) {
            status = "You are badly hurt, you should find some food!";
        } else {
            status = "You are close to death, find help immediately!";
        }
        return "Health: " + playerHealth + " - " + status;
    }

    // Metode til at equip våben
    public void equipWeapon(Weapon weapon) {
        equippedWeapon = weapon;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }
    public void reduceHealth(int damage) {
        playerHealth -= damage;
        System.out.println("You lost " + damage + "Your current health is " + playerHealth);
    }
    public void attack (Enemy enemy) {
        if (equippedWeapon == null) {
            System.out.println("You have no weapon equipped");
            return;

        }
        if(!equippedWeapon.canUse()) {
            System.out.println("You can't use your equipped weapon");
            return;
        }
        System.out.println("You attack " + enemy.getName() + " with " + equippedWeapon.getItemName());
        enemy.hit(equippedWeapon);

        if (!enemy.isDead()) {
            enemy.attack(this);
        } else {
            System.out.println(enemy.getName() + " is dead");
            currentRoom.removeEnemy(enemy);
            enemy.dropWeapon();
        }

    }
    private void displayEnemiesInRoom() {
        List<Enemy> enemies = currentRoom.getEnemies();
        if (enemies.isEmpty()) {
            System.out.println("There are no enemies in this room.");
        } else {
            System.out.println("You see the following enemies in the room:");
            for (Enemy enemy : enemies) {
                System.out.println(enemy);
            }
        }
    }
    public void moveTo(Room newRoom) {
        if (newRoom != null) {
            currentRoom = newRoom;
            System.out.println("You have entered a new room.");
            displayEnemiesInRoom(); // Display enemies when entering a new room
        } else {
            System.out.println("Unfortunately, a wall is blocking the way.");
        }
    }
}








