package homework_conditional_statements.for_tasks.sum_of_numbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        sumOfNumbers();

    }
    public static void sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);

}
