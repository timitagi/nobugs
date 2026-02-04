package zoo;

public class Zoo {
    Animal animal;

    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public void showBehavior(){
        animal.makeSound();
        animal.move();
    }
}
