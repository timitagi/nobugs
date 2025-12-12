package homework_first_classes_objects.circle;


public class Circle {
    private double radius;

    public Circle(double someRadius){
        this.radius = someRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double calculateArea(){
        double area = Math.PI * (radius*radius);
        return area;
    }
    public double calculateCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
