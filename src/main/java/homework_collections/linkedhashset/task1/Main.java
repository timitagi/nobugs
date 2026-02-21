package homework_collections.linkedhashset.task1;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Люблю");
        set.add("Грозу");
        set.add("В");
        set.add("Начале");
        set.add("Мая");
        for(String word:set){
            System.out.println(word);
        }
    }
}
