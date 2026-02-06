package aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark();
        Starfish starfish = new Starfish();
        aquarium.setSeaCreature(shark);
        aquarium.showMovement();
        aquarium.setSeaCreature(starfish);
        aquarium.showMovement();
    }
}
