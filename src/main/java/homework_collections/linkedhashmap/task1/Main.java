package homework_collections.linkedhashmap.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

    LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    map.put("Молоко", 35);
    map.put("Яблоки", 115);
    map.put("Хлеб", 88);
    map.put("Бананы", 22);
    map.put("Курица", 250);
    for (Map.Entry<String,Integer>entry:map.entrySet()){
        System.out.println(entry);
        }
}
}
