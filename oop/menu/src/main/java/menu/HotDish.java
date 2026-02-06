package menu;

public class HotDish implements Dish{
    private final int temperature;

    public HotDish(int temperature){
        this.temperature = temperature;
    }

    @Override
    public String getDescription() {
        return "Это горячее блюдо с температурой " + this.temperature + " градусов";
    }
}
