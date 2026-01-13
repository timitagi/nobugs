package homework_conditional_statements.if_else.test_results;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args){
        testResults();

    }

    public static void testResults(){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        String description = "";
        if(result>=90 && result<=100){
            description = "Отлично";
        } else if (result<=89 && result>=75){
            description = "Хорошо";
        } else if (result<=74 && result>=60) {
            description = "Удовлетворительно";
        } else if (result<60){
            description = "Неудовлетворительно";
        } else {
            description = "Оценка отсутствует";
        }
        System.out.println(description);
    }
}
