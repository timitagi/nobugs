package practice_сonditional_statements.solvers;

import java.util.Random;
import java.util.Scanner;


public class DoWhileTaskSolver {

    public static void main(String[] args) {
        findNumber();
    }


    public static void findNumber(){
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(5);

        int number;

        do {
            System.out.println("Угадай число: ");
            number = scanner.nextInt();
        }
            while (number != random);

            System.out.println("Верно!");
        }
}

