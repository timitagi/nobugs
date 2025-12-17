package homework_static_final_modifier.university;

public class University {
    static String universityName = "МГУ";
    final int studentID;
    private String studentName;

    public University(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName){
        University.universityName = newName;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void printStudentInfo(){
        System.out.println("Студент ФИО : " + studentName);
        System.out.println("Порядковый номер : " + studentID);
        System.out.println("Наименование университета : " + universityName);
    }
}
