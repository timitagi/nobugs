package homework_collections.treemap.task1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Коля", 34);
        map.put("Сережа", 56);
        map.put("Антон", 88);
        map.put("Ксюша", 99);
        map.put("Света", 89);
        for (Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}
