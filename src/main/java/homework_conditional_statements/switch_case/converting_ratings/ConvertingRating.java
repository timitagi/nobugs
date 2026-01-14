package homework_conditional_statements.switch_case.converting_ratings;

import java.util.Scanner;

public class ConvertingRating {
    public static void main(String[] args){
        covertingRating();

    }

    public static void covertingRating(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String rating = "";
        if(number>=90 && number<=100){
            rating = "A";
        } else if(number<=89 && number>=80){
            rating = "B";
        } else if(number<=79 && number>=70){
            rating = "C";
        } else if(number<=69 && number>=60){
            rating = "D";
        } else if (number < 60 && number > 0) {
            rating = "F";
        } else {
            rating = "Некорректно";
        }
        System.out.println(rating);
    }
}
