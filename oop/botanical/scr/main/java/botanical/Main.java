package botanical;

public class Main {
    public static void main(String[] args){
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Orchid orchid = new Orchid();
        Cactus cactus = new Cactus();

        botanicalGarden.setPlant(orchid);
        botanicalGarden.maintainPlant();

        botanicalGarden.setPlant(cactus);
        botanicalGarden.maintainPlant();
    }
}
