package homework_first_classes_objects.student_group;


public class Main {
    public static void main (String[] args){
        StudentGroup group = new StudentGroup("07АТ0ВМ1", 33);
        group.setStudentCount(28);
        group.printInfo();
    }
}
