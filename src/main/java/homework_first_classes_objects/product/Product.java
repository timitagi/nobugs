package homework_first_classes_objects.product;

public class Product {
    private String name;
    private double price;

    public Product(String someName,double somePrice){
        this.name = someName;
        this.price = somePrice;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void applyDiscount(double discount){
        this.price = ((100-discount)/100)*this.price;
    }
    public void printInfo(){
        System.out.println("Наименование продукта : " + name);
        System.out.println("Стоимость продукта со скидкой : " + price);
    }
}
