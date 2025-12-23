package practice_сonditional_statements.solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        System.out.println(checkParity(4));
        System.out.println(checkParity(5));
        System.out.println(checkAge(5));
        System.out.println(checkAge(35));
        System.out.println(checkAge(88));
        System.out.println(checkMax(3,5,7));
    }
    /**
     * Метод для проверки четности
     * @param number
     * @return
     */
    public static String checkParity(int number){
        //if-else
        String parity = "Нечетное";
        if(number % 2 == 0){
            parity = "Четное";
        }

        return parity;
    }

    public static String checkAge(int age){
        String ageDescription = "";
        if (age < 18){
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age<=60){
            ageDescription = "Совершеннолетний";
        }
        if (age>60){
            ageDescription = "Пожилой";
        }

        return ageDescription;
    }

    public static int checkMax(int a, int b, int c){
        int maxAB = b;
        if (a>b){
            maxAB = a;
        }
        int max = maxAB;
        if (c>maxAB){
            max = c;
        }
        return max;
    }
}
