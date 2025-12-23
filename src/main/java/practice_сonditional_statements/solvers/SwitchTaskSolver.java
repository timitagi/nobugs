package practice_сonditional_statements.solvers;

import practice_сonditional_statements.Season;

public class SwitchTaskSolver {
    public static void main(String[] args){
        System.out.println(dayOfWeek(15));
        System.out.println(describeSeason(Season.WINTER));

}
    public static String dayOfWeek(int day){
        String dayOfWeek = "";
        switch(day) {
            case 1:
                dayOfWeek = "понедельник";
                break;
            case 2:
                dayOfWeek = "вторник";
                break;
            case 3:
                dayOfWeek = "среда";
                break;
            case 4:
                dayOfWeek = "четверг";
                break;
            case 5:
                dayOfWeek = "пятница";
                break;
            case 6:
                dayOfWeek = "суббота";
                break;
            case 7:
                dayOfWeek = "воскресенье";
                break;
            default:
                System.out.println("Несушествующий день недели");
        }

        return dayOfWeek;
    }

    public static String describeSeason(Season season){
        String description = "";
        switch (season){
            case WINTER -> description = "Холодно, снежно";
            case SUMMER -> description = "Жарко";
            case AUTUMN -> description = "Слякоть";
            case SPRING -> description = "Расцветает";
        }

        return description;
    }
}
