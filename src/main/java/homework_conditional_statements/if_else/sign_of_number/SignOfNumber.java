package homework_conditional_statements.if_else.sign_of_number;

import java.util.Scanner;

public class SignOfNumber {
    public static void main(String[] args){
        signOfNumber();
    }

    public static void signOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        String description = "";
        if(number>0){
            description = "Число положительное";
        } else if (number<0) {
            description = "Число отрицательное";
        } else {
            description = "Число равно нулю";
        }
        System.out.println(description);
    }
}
