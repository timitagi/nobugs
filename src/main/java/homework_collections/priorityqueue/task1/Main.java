package homework_collections.priorityqueue.task1;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(843589);
        queue.add(7);
        queue.add(16);
        queue.add(100);
        queue.add(55);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
