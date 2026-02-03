public class Main {
    public static void main(String args[]){
        Zoo zoo = new Zoo();
        Bird bird = new Bird();
        zoo.setAnimal(bird);
        zoo.showBehavior();
        Elephant elephant = new Elephant();
        zoo.setAnimal(elephant);
        zoo.showBehavior();
    }
}
