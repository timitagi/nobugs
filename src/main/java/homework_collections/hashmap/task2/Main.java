package homework_collections.hashmap.task2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Андрей", 35);
        map.put("Тимур", 45);
        map.put("Света", 38);
        map.put("Николай", 23);
        map.put("Сергей", 22);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();

        if(map.containsKey(name)){
            System.out.println("Найдено, возраст " + map.get(name));
        } else {
            System.out.println("Не найдено");
        }
    }
}
