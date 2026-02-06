package farm;

public class Cow implements FarmAnimal{
    @Override
    public void feed(){
        System.out.println("Корова ест траву");
    }

    @Override
    public void care(){
        System.out.println("Корову выгоняют на выпас");
    }

    @Override
    public void produce(){
        System.out.println("Корова дает молоко");
    }
}
