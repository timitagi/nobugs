package homework_collections.hashmap.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Андрей", 35);
        map.put("Тимур", 45);
        map.put("Света", 38);
        map.put("Николай", 23);
        map.put("Сергей", 22);

        for (Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
