package homework_conditional_statements.for_tasks.prime_number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        primeNumber();

    }
    public static void primeNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        if(number<2){
            isPrime = false;
        } else {
            for(int i=2;i<(number-1);i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }

            }
        }
        if(isPrime){
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }
}
