package homework_conditional_statements.break_continue.sum_of_numbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        sumOfNumbers();

    }
    public static void sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            int a = scanner.nextInt();
            if (a<0){
                System.out.println("Некорректное значение");
                break;
            }
            sum=sum+a;
            System.out.println("Накопительная сумма = " + sum);
        }
    }
}
