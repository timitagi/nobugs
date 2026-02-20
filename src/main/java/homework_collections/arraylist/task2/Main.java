package homework_collections.arraylist.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        for (int number:list){
            if (number%2==0){
                System.out.println(number);
            }
        }
    }
}
