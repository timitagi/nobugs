package homework_conditional_statements.break_continue.skip_negative_number;

import java.util.Scanner;

public class SkipNegativeNumber {
    public static void main(String[] args){
        skipNegativeNumber();
    }

    public static void skipNegativeNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number>=0){
            System.out.println("Введите положительное число");
            number = scanner.nextInt();
            if(number<0){
                System.out.println("Вы ввели некорректное число");
                continue;
            }
            System.out.println("Вы ввели " + number);
        }
    }
}
