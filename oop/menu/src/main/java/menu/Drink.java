package menu;

public class Drink implements Dish{
    private final int volume;

    public Drink(int volume){
        this.volume = volume;
    }

    @Override
    public String getDescription(){
        return "Этот напиток объемом " + this.volume + " мл";
    }
}
