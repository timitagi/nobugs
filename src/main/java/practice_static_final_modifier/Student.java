package practice_static_final_modifier;

public class Student {
    final static int MAX_YEARS = 11;
    static int studentCount;

    static {
        studentCount = 0;
    }



    private int age;
    String name;

    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
        studentCount ++; //инкремент, увеличение значения на 1;
    }

    static void printMaxYears(){
        System.out.println(MAX_YEARS);
    }
}
