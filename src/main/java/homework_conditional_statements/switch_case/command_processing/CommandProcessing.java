package homework_conditional_statements.switch_case.command_processing;

import java.util.Scanner;

public class CommandProcessing {
    public static void main(String[] args){
        commandProcessing();

    }

    public static void commandProcessing(){
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String description = "";
        switch (command){
            case "start":
                description = "Система запущена";
                break;
            case "stop":
                description = "Система остановлена";
                break;
            case "restart":
                description = "Система перезапущена";
                break;
            case "status":
                description = "Проверка статуса";
                break;
            default:
                description = "Описание отсутствует";
        }
        System.out.println(description);

    }
}
