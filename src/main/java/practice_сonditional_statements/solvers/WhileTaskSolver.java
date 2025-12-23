package practice_сonditional_statements.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args){
        //printAllNumberBefore10();
        //commandReader();
        System.out.println(sumOfNumbers(123));
        System.out.println(sumOfNumbers(1101));
    }

    public static void printAllNumberBefore10(){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader(){
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            System.out.print("Введите команду : ");
            command = scanner.nextLine();
        }
            System.out.println("Программа завершена!");
        }

    public static int sumOfNumbers(int number){
        int sum = 0;
        while (number>0){
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }
}
