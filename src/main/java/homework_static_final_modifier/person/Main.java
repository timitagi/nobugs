package homework_static_final_modifier.person;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Иван", "Иванов", "123-123-123");
        Person person2 = new Person("Петр", "Петров", "124-124-124");
        Person person3 = new Person("Сергей", "Сергеев", "125-125-125");

        person1.setFirstName("Вячеслав");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
        //person1.ssn = "126-126-126" - невозможно обратиться и поменять

    }
}
