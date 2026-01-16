package homework_conditional_statements.while_tasks.calculating_the_factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        calculatingFactorial();

    }

    public static void calculatingFactorial(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i<=n){
            result = result * i;
            i++;
        }
        System.out.println("Факториал = " + result);
    }
}
