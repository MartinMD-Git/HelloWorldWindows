package AdventureSpil;

public class Adventure {
    private Player player;
    private UserInterface ui;
    private Map map;

    public Adventure(){
        map = new Map();
        player = new Player(map.getStartingRoom());
        ui = new UserInterface();
    }


    public void start(){
        ui.displayMessage("Welcome to the Adventure game!");
        while (true){
            ui.displayMessage("You are in " + player.getCurrentRoom().getDescription());
            String command = ui.getUserInput();
            handleCommand(command);

        }
    }

    private void handleCommand(String command) {
        switch (command) {
            case "north":
            case "n":
            player.move("north");
            break;

            case "south":
            case "s":
            player.move("south");
            break;

            case "east":
            case "e":
            player.move("east");
            break;

            case "west":
            case "w":
            player.move("west");
            break;

            case "look":
                ui.displayMessage(player.getCurrentRoom().getDescription());
                break;

            case "exit":
                ui.displayMessage("Thanks for playing");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid command. Try 'north', 'south', 'east', 'west', 'look', or 'exit'");
                break;


        }
    }
}
