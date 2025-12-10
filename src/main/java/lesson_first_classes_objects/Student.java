package lesson_first_classes_objects;

public class Student {
    //поля
    int age;
    String name;

    //конструктор
    public Student(int someAge, String someName){
        age = someAge;
        name = someName;

    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }

    void print(){
        System.out.println("Возраст " + age + ", имя " + name);
    }
}
