package practice_static_final_modifier;

public class Main {
    public static void main(String[] args){
        //создали переменную
        //присвоили переменную экземпляр класса Студент
        //вызвав дефолтный конструктор
        System.out.println(Student.studentCount);
        Student petya = new Student(18, "Петя");
        System.out.println(Student.studentCount);
        Student kolya = new Student(20, "Коля");
        System.out.println(Student.studentCount);


    }

}