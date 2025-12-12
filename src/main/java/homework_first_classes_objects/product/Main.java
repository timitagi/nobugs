package homework_first_classes_objects.product;

public class Main {
    public static void main(String[] args){
        Product product = new Product("Апельсины", 120);
        product.setPrice(100);
        product.applyDiscount(15);
        product.printInfo();
    }
}
