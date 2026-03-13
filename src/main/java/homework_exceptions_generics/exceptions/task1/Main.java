package homework_exceptions_generics.exceptions.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){
        try {
            FileReader fileReader = new FileReader("data.txt");
            System.out.println("Файл найден!");
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
    }
}
