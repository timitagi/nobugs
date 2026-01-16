package homework_conditional_statements.do_while_tasks.positive_number;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args){
        requestPositiveNumber();

    }

    public static void requestPositiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("Введите положительное число");
            number = scanner.nextInt();
        } while (number<=0);
            System.out.println("Спасибо, что ввели положительное число");
    }
}
