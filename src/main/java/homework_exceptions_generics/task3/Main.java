package homework_exceptions_generics.task3;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Сергей", 55);
        Person person2 = new Person("Андрей", -1);
        Person person3 = new Person("Илья", 155);

        try {
            person1.validation();
            System.out.println(person1.getName() + " : возраст корректный!");
        } catch (ValidationAgeException e){
            System.out.println(person1.getName() + " : " + e.getMessage());
        }

        try {
            person2.validation();
            System.out.println(person2.getName() + " : возраст корректный");
        } catch (ValidationAgeException e){
            System.out.println(person2.getName() + " : " + e.getMessage());
        }
        try {
            person3.validation();
            System.out.println(person3.getName() + " : возраст корректный");
        } catch (ValidationAgeException e){
            System.out.println(person3.getName() + " : " + e.getMessage());
        }
    }
}
