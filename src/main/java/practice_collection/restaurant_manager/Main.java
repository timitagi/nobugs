package practice_collection.restaurant_manager;

public class Main {
    public static void main(String[] args){
        RestarauntManager manager = new RestarauntManager();

        manager.addNewOrder("Картошка фри");
        manager.addNewOrder("Маргарита");
        manager.addNewOrder("Спагетти");
        manager.printOrders();

        manager.deleteOrder("Спагетти");
        manager.printOrders();

    }
}
