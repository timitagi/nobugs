package firstprogramm;

public class MathOperations {

    public static void main(String[] args) {

        int sum = add(5, 3);
        System.out.println(sum);

        int sub = subtract(10, 4);
        System.out.println(sub);

        int mul = multiply(6, 2);
        System.out.println(mul);

        double div = divide(10, 3);
        System.out.println(div);

        int max = findMax(7, 12);
        System.out.println(max);

        int diff = difference(5, 9);
        System.out.println(diff);

        int area = squareArea(4);
        System.out.println(area);

        int perimeter = squarePerimeter(4);
        System.out.println(perimeter);

        double minutes = convertSecondsToMinutes(130);
        System.out.println(minutes);

        double avgSpeed = averageSpeed(150.0, 3.0);
        System.out.println(avgSpeed);

        double hyp = findHypotenuse(3, 4);
        System.out.println(hyp);

        double circumference = circleCircumference(5);
        System.out.println(circumference);

        double percent = calculatePercentage(200, 25);
        System.out.println(percent);

        double fahrenheit = celsiusToFahrenheit(15);
        System.out.println(fahrenheit);

        double celsius = fahrenheitToCelsius(60);
        System.out.println(celsius);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }
}
