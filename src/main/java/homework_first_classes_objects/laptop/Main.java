package homework_first_classes_objects.laptop;

public class Main {
    public static void main(String[] args){
        Laptop laptop = new Laptop("Lenovo A16", 350.34);
        laptop.printInfo();
        laptop.setPrice(254.88);
        laptop.printInfo();
    }
}
