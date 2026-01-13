package homework_conditional_statements.if_else.discount_amount;

import java.util.Scanner;

public class DiscountAmount {
    public static void main(String[] args){
        discountAmount();

    }

    public static void discountAmount(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String discount = "";
        if(age<18 && age>0){
            discount = "25%";
        } else if (age>=65) {
            discount = "30%";
        } else {
            discount = "без скидки";
        }
        System.out.println(discount);
    }
}
