package practice_сonditional_statements.solvers;

public class ForTaskSolver {
    public static void main(String[] args){
        multiplyTable(5);
        System.out.println(summOfAllNumber(10));
    }
    public static void multiplyTable(int number){
        for(int i=1; i<=10;i++){
            System.out.println(
                    number + "x" + i + "=" + number * i);
        }
    }

    public static int summOfAllNumber(int n){
        int sum = 0;

        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
}
