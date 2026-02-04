package pet;

public class Main {
    public static void main(String[] args){
        PetManager petManager = new PetManager();
        Dog dog = new Dog();
        Cat cat = new Cat();
        petManager.setPet(dog);
        petManager.handlePet();
        petManager.setPet(cat);
        petManager.handlePet();
    }
}
