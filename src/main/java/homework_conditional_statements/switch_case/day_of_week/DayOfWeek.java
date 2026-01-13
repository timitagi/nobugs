package homework_conditional_statements.switch_case.day_of_week;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        dayOfWeek();

    }

    public static void dayOfWeek(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String day = "";
        switch (number){
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Такого дня недели не существует";
        }
        System.out.println(day);
    }
}
