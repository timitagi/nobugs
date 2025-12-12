package homework_first_classes_objects.teacher;

public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Сорокина К.В", "Обществознание");
        teacher.setSubject("Природоведение");
        teacher.prinInfo();
    }
}
