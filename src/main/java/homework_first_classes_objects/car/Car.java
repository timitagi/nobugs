package homework_first_classes_objects.car;

public class Car {
    String brand;
    int year;

    public Car(String someBrand,int someYear) {
        brand = someBrand;
        year = someYear;
    }
        public String getBrand(){
            return brand;
        }

        public int getYear(){
            return year;
        }

        public void setBrand(String newBrand){
            brand = newBrand;
        }

        public void setYear(int newYear){
            year = newYear;
        }

        public void print(){
            System.out.println("Марка авто : " + brand + ", год выпуска авто : " + year);
        }
}
