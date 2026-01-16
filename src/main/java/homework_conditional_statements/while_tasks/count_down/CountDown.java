package homework_conditional_statements.while_tasks.count_down;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args){
        printCountDown();

    }
    public static void printCountDown(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while (number>=i){
            System.out.println(number);
            number--;
        }
    }
}
