package homework_static_final_modifier.gamesettings;

public class Main {
    public static void main(String[] args){
        GameSettings game1 = new GameSettings("Counter-Strike 1.6", 28);
        GameSettings game2 = new GameSettings("Counter-Strike 2.0", 27);
        GameSettings.setMaxPlayers(29);
        game1.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();
    }
}
