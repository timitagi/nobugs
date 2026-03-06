package practice_exceptions_generics.library.exceptions;

// непроверяемый -> RuntimeException
public class InvalidBookException extends RuntimeException{
    public InvalidBookException(String message){
        super(message);
    }

}
