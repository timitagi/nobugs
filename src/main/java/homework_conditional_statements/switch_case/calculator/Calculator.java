package homework_conditional_statements.switch_case.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        calculations();

    }

    public static void calculations(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = scanner.nextDouble();
        System.out.println("Введите оператор вычисления");
        String operator = scanner.next();
        System.out.println("Введите число b");
        double b = scanner.nextDouble();
        double result = 0;
        boolean isValid = true;
        switch (operator){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                if(b==0){
                    System.out.println("На ноль делить нельзя");
                    isValid = false;
                }else {
                    result = a/b;
                } break;
            default:
                System.out.println("Введите корректные данные");
                isValid = false;
        }
        if(isValid) {
            System.out.println(result);
        }
    }
}
