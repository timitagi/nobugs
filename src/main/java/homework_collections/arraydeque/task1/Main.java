package homework_collections.arraydeque.task1;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("А я");
        deque.add("иду");
        deque.add("шагаю");
        deque.add("по");
        deque.add("Москве");
        for (String value : deque){
            System.out.println(value);
        }
    }
}
