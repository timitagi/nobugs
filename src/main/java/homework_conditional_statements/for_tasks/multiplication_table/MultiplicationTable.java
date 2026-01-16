package homework_conditional_statements.for_tasks.multiplication_table;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        multiply();

    }
    public static void multiply(){
        Scanner scanner = new Scanner(System.in);
        int table = 0;
        System.out.println("Введите число для отображения таблицы умножения");
        int number = scanner.nextInt();
        System.out.println( "Таблица умножения для числа " + number);
        for(int i = 1;i<=10;i++){
            table = number * i;

            System.out.println(number + " * "  + i + " = " + table);
        }
    }
}
