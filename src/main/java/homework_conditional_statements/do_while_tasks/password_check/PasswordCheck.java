package homework_conditional_statements.do_while_tasks.password_check;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args){
        passwordCheck();


    }
    public static void passwordCheck(){
        Scanner scanner = new Scanner(System.in);
        String password = "Qwer1234!";
        String input_password;
        do {
            System.out.println("Введите правильный пароль");
            input_password = scanner.nextLine();
        }while (!input_password.equals(password));
        System.out.println("Вход выполнен");
    }
}
