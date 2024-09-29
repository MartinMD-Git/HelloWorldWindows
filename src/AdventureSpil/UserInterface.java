package AdventureSpil;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }
    public String getUserInput() {
        return scanner.nextLine().toLowerCase();
    }
    public void displayMessage(String message) {
        System.out.println(message);
    }
}

//        adventure = new Adventure();
//    }
//
//    public void start() {
//        System.out.println("Welcome to the AdventureSpil.Adventure game");
//        printHelp();
//        System.out.println("You are in " + adventure.getCurrentRoom().getDescription());
//
//        while (true) {
//            String input = scanner.nextLine().toLowerCase();
//
//            switch (input) {
//                case "go north":
//                case "north":
//                case "n":
//                    adventure.move("north");
//                    break;
//
//                case "go south":
//                case "south":
//                case "s":
//                    adventure.move("south");
//                    break;
//
//                case "go east":
//                case "east":
//                case "e":
//                    adventure.move("east");
//                    break;
//
//                case "go west":
//                case "west":
//                case "w":
//                    adventure.move("west");
//                    break;
//
//                case "look":
//                    adventure.look();
//                    System.out.println("Looking around");
//                    break;
//
//
//                case "exit":
//                    System.out.println("Thanks for playing");
//                    return;
//
//
//                default:
//                    System.out.println("Invalid input");
//                    printHelp();
//                    break;
//            }
//        }
//    }
//    private void printHelp() {
//        System.out.println("Type the direction you want to go in (north, east, south, west)");
//        System.out.println("Type 'look' to look at your surroundings");
//        System.out.println("Type 'exit' to exit the game");
//    }
//
//    public static void main(String[] args) {
//        UserInterface ui = new UserInterface();
//        ui.start();
//    }
//}
