package homework_conditional_statements.break_continue.skip_number;

public class SkipNumber {
    public static void main(String[] args){
        skipNumber();

    }
    public static void skipNumber(){
        for(int i=1;i<=20;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
