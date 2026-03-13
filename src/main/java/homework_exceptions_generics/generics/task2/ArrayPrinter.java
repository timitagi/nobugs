package homework_exceptions_generics.generics.task2;

public class ArrayPrinter {

    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.println(element);
        }
    }
}
