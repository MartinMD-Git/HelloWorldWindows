package Adventure2;

import java.util.List;
import java.util.Scanner;

public class UserInterface {


    public void start() {

        Adventure adventure = new Adventure();

        System.out.println("Hello and welcome to the text adventure game! Please begin the game by giving your character a name:");
        Scanner scanner = new Scanner(System.in);
        String playerName;
        String name = scanner.nextLine();
        playerName = name;
        System.out.println("Your characters name is " + playerName);
        System.out.println("To move around, use commands: 'go north', 'go east', go west', 'go south'.");
        System.out.println("You can at all times write 'help', 'look' or 'exit', 'backpack'.");
        System.out.println("Your current health is: " + adventure.getPlayer().getPlayerHealth() + ". Do not let it reach 0");
        System.out.println("If there are any items in the room your character is in, you can always pick them up and drop them whereever you like. Simply write: 'take <item>' or 'drop <item>'.");
        System.out.println(playerName + " starts in room 1. Tip: Take a look around to see if there is anything useful for " + playerName + " to use.");

        Scanner input = new Scanner(System.in);
        String useraction = "";

        while (!useraction.equalsIgnoreCase("exit")) {
            useraction = input.nextLine();

            // Denne kode herover viser hvordan vi tager et item op, ved hjælp af at skrive "take" først.
            if (useraction.startsWith("take ")) {
                String[] parts = useraction.split("take ", 2);
                if (parts.length < 2) {
                    System.out.println("Take what?"); // Hvis man bare skriver "take" uden noget efterfølgende, genkender koden at man vil samle noget op, men ikke hvad man vil samle op.
                } else {
                    String itemName = parts[1].trim(); // dette fjerner eventuelle unødvendige mellemrum.
                    Item item = adventure.getPlayer().getCurrentRoom().takeItem(itemName); // Her finder vi item og fjerner det igen fra Listen, hvis man tager det op.
                    if (item != null) {
                        System.out.println("You took " + item.getItemName());
                        adventure.getPlayer().addItemToInventory(item);
                    } else {
                        System.out.println("No such item in this room. ");
                    }
                }
            }
            else if (useraction.startsWith("drop ")) {
                String[] parts = useraction.split("drop ", 2);
                if (parts.length < 2) { // Ligesom før med at skulle "take", så er det bare drop.
                    System.out.println("Drop what?");
                } else {
                    String itemName = parts[1].trim();
                    Item itemToDrop = null;
                    for (Item item : adventure.getPlayer().getItemArrayList()) {
                        if (item.getItemName().equalsIgnoreCase(itemName)) {
                            itemToDrop = item;
                            break;
                        }

                    }
                    if (itemToDrop != null) {
                        adventure.getPlayer().getCurrentRoom().dropItem(itemToDrop);
                        adventure.getPlayer().getItemArrayList().remove(itemToDrop);
                        System.out.println("You dropped " + itemName + " in room " + adventure.getPlayer().getCurrentRoom().getRoomNumber() + ".");
                    } else {
                        System.out.println("You don't have that item.");
                    }

                }


            } else if (useraction.startsWith("eat ")) {
                String[] parts = useraction.split("eat", 2);
                if(parts.length < 2) {
                    System.out.println("Eat what?");
                } else {
                    String itemName = parts[1].trim();
                    String result = adventure.eat(itemName);
                    System.out.println(result);

                }
            }
            else if (useraction.startsWith("equip ")) {
                String[] parts = useraction.split("equip ", 2);
                if (parts.length < 2) {
                    System.out.println("Equip what?");
                } else {
                    String weaponName = parts[1].trim();
                    Weapon weaponToEquip = null;

                    for (Item item : adventure.getPlayer().getItemArrayList()) {
                        if (item instanceof Weapon && item.getItemName().equalsIgnoreCase(weaponName)) {
                            weaponToEquip = (Weapon) item;
                            break;
                        }
                    }

                    if (weaponToEquip != null) {
                        adventure.getPlayer().equipWeapon(weaponToEquip);
                        System.out.println("You equipped " + weaponName);
                    } else {
                        System.out.println("You do not have that weapon in your inventory or it is not a weapon.");
                    }
                }
            }
            else if (useraction.startsWith("attack")) {
                String[] parts = useraction.split("attack", 2);
                Room currentRoom = adventure.getPlayer().getCurrentRoom();

                if(currentRoom.getEnemies().isEmpty()){
                    System.out.println("There are no enemies to attack in this room");
                } else {
                    Enemy targetEnemy;

                    if (parts.length < 1) {
                        String enemyName = parts[1].trim();
                        targetEnemy = currentRoom.getEnemies().stream()
                                .filter(e -> e.getName().equalsIgnoreCase(enemyName))
                                .findFirst()
                                .orElse(null);

                        if (targetEnemy == null) {
                            System.out.println("There is no enemy with that name in this room.");
                            continue;
                        }
                    } else {
                        targetEnemy = currentRoom.getNearestEnemy();
                    }
                    adventure.getPlayer().attack(targetEnemy);
                }

            }

                else if(useraction.startsWith("attack ")) {
                Weapon equipped = adventure.getPlayer().getEquippedWeapon();

                if (equipped == null) {
                    System.out.println("You have no weapon equipped to attack.");
                } else if (!equipped.canUse()) {
                    System.out.println("Your weapon is out of uses and cannot be used.");
                } else {
                    // Perform the attack
                    equipped.canUse();
                    if (equipped instanceof RangedWeapon) {
                        System.out.println("You fire your " + equipped.getItemName() + " into the empty air.");
                    } else {
                        System.out.println("You swing your " + equipped.getItemName() + " at the empty space.");
                    }
                }
            }
                else {
                switch (useraction) {

                    case "inventory", "i", "backpack", "b", "inv" -> {
                        System.out.println(playerName + " has " + adventure.getPlayer().getItemArrayList() + " items in the backpack.");
                        Weapon equippedWeapon = adventure.getPlayer().getEquippedWeapon();
                        if (equippedWeapon != null) {
                            System.out.println("Currently equipped weapon: " + equippedWeapon.getItemName());
                        } else {
                            System.out.println("No weapon is currently equipped.");
                        }

                    }

                    case "go n", "go north", "n", "north" -> {
                        Room newRoom = adventure.getPlayer().getCurrentRoom().getN();
                        adventure.getPlayer().moveTo(newRoom);


                    }

                    case "go s", "go south", "s", "south" -> {
                        Room newRoom = adventure.getPlayer().getCurrentRoom().getS();
                        adventure.getPlayer().moveTo(newRoom);

                    }

                    case "go e", "go east", "e", "east" -> {
                        Room newRoom = adventure.getPlayer().getCurrentRoom().getE();
                        adventure.getPlayer().moveTo(newRoom);
                    }

                    case "go w", "go west", "w", "west" -> {
                        Room newRoom = adventure.getPlayer().getCurrentRoom().getW();
                        adventure.getPlayer().moveTo(newRoom);
                        
                    }

                    case "health" -> {
                        int health = adventure.getPlayer().getPlayerHealth();
                        String healthStatus;

                        if (health > 75) {
                            healthStatus = "You are in great health.";
                        } else if (health > 50) {
                            healthStatus = "You are in good health.";
                        } else if (health > 25) {
                            healthStatus = "You are in poor health, be careful.";
                        } else {
                            healthStatus = "You are in critical condition!";
                        }
                        System.out.println("Health: " + health + " - " + healthStatus);
                    }

                    case "look", "l", "Look" -> {
                        List<Item> items = adventure.getPlayer().getCurrentRoom().getItems();
                        List<Enemy> enemies = adventure.getPlayer().getCurrentRoom().getEnemies();
                        if (items.isEmpty()) {
                            System.out.println("There is nothing useful for " + playerName + " to pick up in this room.");
                        } else {
                            System.out.println("You see the following items in the current room:");
                            for (Item item : items) {
                                System.out.println(item);
                            }
                        }
                        if (enemies.isEmpty()) {
                            System.out.println("There are no enemies in this room.");
                        } else {
                            System.out.println("You see the following enemies:");
                            for (Enemy enemy : enemies) {
                                System.out.println(enemy);
                            }
                        }
                    }

                    case "help" -> {
                        System.out.println("To move around, write either 'go north', 'go east', go west', 'go south'.");
                        System.out.println("You can at all times write 'help', 'look' or 'exit'.");
                    }

                    default -> {
                        System.out.println("Unknown command");
                    }

                }
                System.out.println(playerName + " is now in room " + adventure.getPlayer().getCurrentRoom().getRoomNumber() + ".");
                System.out.println(adventure.getPlayer().getCurrentRoom().getRoomDescription());

            }
        }
    }
}
