package farm;

public class Main {
    public static void main(String[] args){
        Farm farm = new Farm();
        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        farm.setFarmAnimal(cow);
        farm.serviceAnimal();
        farm.setFarmAnimal(chicken);
        farm.serviceAnimal();
    }
}
