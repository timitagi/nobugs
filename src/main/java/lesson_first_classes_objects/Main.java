package lesson_first_classes_objects;

public class Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию
        Student petya = new Student(19,"Петя");

        System.out.println(petya.age);
        System.out.println(petya.name);

        Student kolya = new Student(20, "Коля");
        System.out.println(kolya.age);
        System.out.println(kolya.name);

        petya.setName("Антон");
        petya.setAge(54);
        System.out.println("Новое имя Пети : " + petya.name);
        System.out.println("Новый возраст Пети : " + petya.age);
        petya.print();
        petya.name = "Евгений";
        petya.print();
        kolya.print();

        // дебаггинг или дебаг

    }
}
