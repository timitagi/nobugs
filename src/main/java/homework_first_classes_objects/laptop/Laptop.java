package homework_first_classes_objects.laptop;

public class Laptop {
    String brand;
    double price;

    public Laptop(String someBrand, double somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    public String getBrand(){
        return this.brand;
    }
    public double getPrice(){
        return this.price;
    }
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void printInfo(){
        System.out.println("Наименование бренда ноутбука : " + brand);
        System.out.println("Стоимость ноутбука : " + price);
    }
}
