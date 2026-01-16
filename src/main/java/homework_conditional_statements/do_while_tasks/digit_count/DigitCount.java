package homework_conditional_statements.do_while_tasks.digit_count;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args){
        printDigitCount();

    }
    public static void printDigitCount(){
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int count = 0;
        if (digit == 0) {
            count = 1;
        }else{
            do {
                digit = digit / 10;
                count++;
            } while (digit != 0) ;
        }
            System.out.println(count);
        }
    }

