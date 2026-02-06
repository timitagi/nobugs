package menu;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        HotDish hotDish = new HotDish(50);
        Drink drink = new Drink(600);
        menu.addDish(hotDish);
        menu.addDish(drink);
        menu.printMenu();

    }
}
