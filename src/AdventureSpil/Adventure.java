package AdventureSpil;

public class Adventure {
    private Player player;
    private UserInterface ui;
    private Map map;
    private CommandProcessor commandProcessor;

    public Adventure(){
        map = new Map();
        player = new Player(map.getStartingRoom());
        ui = new UserInterface();
        commandProcessor = new CommandProcessor(player, ui);
    }


    public void start(){
        ui.displayMessage("Welcome to the Adventure game!");
        while (true){
            ui.displayRoomInfo(player.getCurrentRoom()); // Display room and items
            String command = ui.getUserInput();
            commandProcessor.handleCommand(command);

        }
    }
}


