package homework_exceptions_generics.exceptions.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        divide(a,b);

    }

    public static void divide(int a, int b){
        try {
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!");
        }
    }
}
