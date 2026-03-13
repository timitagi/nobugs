package homework_exceptions_generics.generics.task3;

public class Main {
    public static void main(String[] args){

        Pair<String, Integer> pair = new Pair<>();

        pair.setFirst("Возраст");
        pair.setSecond(35);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
