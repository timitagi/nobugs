package homework_exceptions_generics.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void validateEmail(String email){
        String regex = ".+@.+\\..+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(!matcher.matches()) {
            throw new InvalidEmailException("Некорректный email: " + email);
        }
    }
}
