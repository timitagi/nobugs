package homework_conditional_statements.if_else.check_parity;

import java.util.Scanner;

public class CheckParity {
    public static void main(String[] args){
        checkParity();

    }

    public static void checkParity(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String description = "";
        if(number%2 == 0){
            description = "Четное число";
        } else {
            description = "Нечетное число";
        }
        System.out.println(description);
    }
}
