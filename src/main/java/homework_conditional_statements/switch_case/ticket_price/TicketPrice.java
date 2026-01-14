package homework_conditional_statements.switch_case.ticket_price;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args){
        ticketPrice();

    }

    public static void ticketPrice(){
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        String price = "";
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                price = "300 рублей";
                break;
            case 6:
            case 7:
                price = "450 рублей";
                break;
            default:
                price = "покупка невозможна";
        }
        System.out.println(price);
    }
}
