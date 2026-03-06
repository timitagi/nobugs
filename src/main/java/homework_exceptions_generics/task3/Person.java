package homework_exceptions_generics.task3;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void validation() throws ValidationAgeException{
        if (this.age < 0 || this.age > 150) {
            throw new ValidationAgeException("Некорректный возраст пользователя!");

        }
    }
}
