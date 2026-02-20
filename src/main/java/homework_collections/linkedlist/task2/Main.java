package homework_collections.linkedlist.task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String>list = new LinkedList<>();
        list.add("Открой дверь!");
        list.add("Выпусти собаку!");
        list.add("Подготовь сумку!");
        list.add("Возьми ключи!");
        list.add("Включи свет!");
        list.add("Возьми мусор!");
        list.add("Выключи свет");
        list.add("Закрой дверь!");
        while (!list.isEmpty()){
            String task = list.poll();
            System.out.println("Я работаю с задачей " + task);
        }
    }
}
