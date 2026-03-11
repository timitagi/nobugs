package homework_exceptions_generics.task4;

public class Main {
    public static void main(String[] args){
        String email1 = "test@mail.com";
        String email2 = "invalid-email";

        EmailValidator.validateEmail(email1);
        System.out.println("Корректный мейл " + email1);

        EmailValidator.validateEmail(email2);
        System.out.println("Корректный мейл " + email2);
    }
}
