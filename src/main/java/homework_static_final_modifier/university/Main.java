package homework_static_final_modifier.university;

public class Main {
    public static void main(String[] args){
        University student1 = new University(111, "Петров И.В");
        University student2 = new University(112, "Иванов И.В");
        University student3 = new University(113, "Васечкин И.В");

        University.changeUniversityName("МИСИ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
