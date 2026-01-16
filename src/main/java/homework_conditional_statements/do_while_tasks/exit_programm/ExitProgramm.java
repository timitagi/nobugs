package homework_conditional_statements.do_while_tasks.exit_programm;

import java.util.Scanner;

public class ExitProgramm {
    public static void main(String[] args){
        exitProgramm();

    }
    public static void exitProgramm(){
        Scanner scanner = new Scanner(System.in);
        String command;
        do{
            System.out.println("Введите команду exit, чтобы выйти из программы");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
    }
}
