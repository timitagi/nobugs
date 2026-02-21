package homework_collections.treeset.task1;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5,3,2,4,1));
        for (int number:set){
            System.out.println(number);

        }
    }
}
