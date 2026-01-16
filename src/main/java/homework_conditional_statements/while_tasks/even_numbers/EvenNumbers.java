package homework_conditional_statements.while_tasks.even_numbers;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        printEvenNumbers();

    }
    public static void printEvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while (i<=number){
            if(i%2==0) {
                System.out.println("Четное число " + i);
            }
            i++;
        }
    }
}
