package homework_conditional_statements.do_while_tasks.output_number;

public class OutputNumber {
    public static void main(String[] args){
        printOutputNumber();

    }

    public static void printOutputNumber(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
