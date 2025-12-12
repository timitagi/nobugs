package homework_first_classes_objects.bank_account;

public class Main {
    public static void main(String[] args){
        BankAccount user123 = new BankAccount("Петров Петр Павлович", 5000);
        user123.deposit(3000);
        user123.withdraw(2000);
        user123.printBalance();
        user123.setOwner("Павлов Павел Петрович");
        user123.printBalance();
    }
}
