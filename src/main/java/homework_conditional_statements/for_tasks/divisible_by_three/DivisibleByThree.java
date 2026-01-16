package homework_conditional_statements.for_tasks.divisible_by_three;

public class DivisibleByThree {
    public static void main(String[] args){
        divisibleByThree();


    }
    public static void divisibleByThree(){
        for(int i=0;i<=100;i++){
            if(i%3==0){
                System.out.println("Число " + i + " делится на 3");
            }
        }
    }
}
