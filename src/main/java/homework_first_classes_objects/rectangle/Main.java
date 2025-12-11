package homework_first_classes_objects.rectangle;


public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(31, 45);
        rectangle.setWidth(24);
        System.out.println("Ширина : " + rectangle.getWidth());
        System.out.println("Площадь прямоугольника : " + rectangle.calculateArea());

    }
}
