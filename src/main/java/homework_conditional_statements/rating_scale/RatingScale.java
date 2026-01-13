package homework_conditional_statements.rating_scale;

import java.util.Scanner;

public class RatingScale {
    public static void main(String[] args){
        ratingScale();

    }

    public static void ratingScale(){
        Scanner scanner = new Scanner(System.in);
        int rating = scanner.nextInt();
        String description = "";
        switch (rating){
            case 1:
                description = "Неудовлетворительно";
                break;
            case 2:
                description = "Неудовлетворительно";
                break;
            case 3:
                description = "Удовлетворительно";
                break;
            case 4:
                description = "Хорошо";
                break;
            case 5:
                description = "Отлично";
                break;
            default:
                description = "Отсутствует оценка";
                break;
        }
        System.out.println(description);
    }
}
