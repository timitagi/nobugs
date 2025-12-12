package homework_first_classes_objects.student_group;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String someGroup, int someCount){
        this.groupName = someGroup;
        this.studentCount = someCount;
    }

    public String getGroupName(){
        return groupName;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public void setGroupName(String newGroup){
        this.groupName = newGroup;
    }
    public void setStudentCount(int newCount){
        this.studentCount = newCount;
    }
    public void printInfo(){
        System.out.println("Наименование группы : " + groupName);
        System.out.println("Количество студентов : " + studentCount);
    }
}
