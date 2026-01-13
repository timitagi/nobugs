package homework_conditional_statements.if_else.largest_of_numbers;

import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args){
        largestOfNumbers();

    }

    public static void largestOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String description = "";
        if(number1>number2){
            description = "Первое число больше второго";
        } else {
            description = "Второе число больше первого";
        }
        System.out.println(description);
    }
}
