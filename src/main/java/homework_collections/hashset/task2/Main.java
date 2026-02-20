package homework_collections.hashset.task2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        if (set.contains(11)){
            System.out.println("Число есть в списке");
        }
        else {
            System.out.println("Число отсутствует");
        }
    }
}
