package homework_exceptions_generics.generics.task1;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        String value = stringBox.getItem();
        System.out.println(value);

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        int value2 = integerBox.getItem();
        System.out.println(value2);
    }
}
