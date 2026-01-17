package homework_conditional_statements.break_continue.input_command;

import java.util.Scanner;

public class InputCommand {
    public static void main(String[] args){
        inputCommand();

    }

    public static void inputCommand(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                System.out.println("Программа завершена");
                break;
            }
            System.out.println("Вы ввели " + command);

        }
    }
}
