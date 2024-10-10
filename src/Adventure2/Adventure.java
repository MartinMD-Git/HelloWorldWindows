package Adventure2;


public class Adventure {

    private Map map;
    private Player player;

    public Adventure() {
        map = new Map();
        player = new Player(map.getRoom());
    }

    public Player getPlayer() {
        return player;
    }
    public String eat(String foodName) {
        Player.FoodStatus status = player.eat(foodName);
        switch (status) {
            case GOOD:
                return "You ate " + foodName + ". You now have " + player.getPlayerHealth() + " healthpoints";

            case BAD:
                return "You ate " + foodName + ". You lost " + player.getPlayerHealth() + " healthpoints";

            case NOT_FOOD:
                return "You cannot eat that";

            default:
                return "Invalid input";
        }
    }


}