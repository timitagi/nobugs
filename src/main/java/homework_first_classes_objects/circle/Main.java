package homework_first_classes_objects.circle;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(15);
        System.out.println("Круг с радиусом = " + circle.getRadius());
        circle.setRadius(18);
        System.out.println("Круг с радиусом = " + circle.getRadius());
        System.out.println("Площадь круга = " + circle.calculateArea());
        System.out.println("Длина окружности = " + circle.calculateCircumference());


    }
}
