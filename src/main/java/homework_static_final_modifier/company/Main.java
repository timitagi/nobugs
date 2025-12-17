package homework_static_final_modifier.company;

public class Main {
    public static void main(String[] args){
        Company.companyName = "Рога и Копыта";
        Company.printCompanyName();
        Company employee1 = new Company(118, "Иванов Петр");
        Company employee2 = new Company(119, "Сергеев Иван");
        Company employee3 = new Company(120, "Русланов Константин");
        Company.companyName = "АльфаКом";
        System.out.println(employee1.companyName);
        System.out.println(employee2.companyName);
        System.out.println(employee3.companyName);
        // employee1.employeeID = 123; // ошибка компиляции: final поле



    }
}
