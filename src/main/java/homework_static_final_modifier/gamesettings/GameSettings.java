package homework_static_final_modifier.gamesettings;


public class GameSettings {
    static int maxPlayers = 28;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName,int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayers){
        GameSettings.maxPlayers = newMaxPlayers;
    }

    public void addPlayer(){
        if(currentPlayers<maxPlayers){
            currentPlayers++;
        } else {
            System.out.println("Кол-во игроков онлайн превышено!Попробуйте позже!");
        }
    }

    public void printGameStatus(){
        System.out.println("Игра : " + gameName);
        System.out.println("Текущий онлайн : " + currentPlayers);
        System.out.println("Максимальное кол-во онлайн игроков : " + maxPlayers);
    }
}
