package homework_first_classes_objects.bank_account;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String someOwner, int someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    public void setOwner(String newOwner){
        this.owner = newOwner;
    }
    public void deposit(int amount){
        this.balance = amount + balance;
    }
    public void withdraw(int amount){
        this.balance = balance-amount;
    }
    public void printBalance(){
        System.out.println("Пользователь ФИО : " + owner);
        System.out.println("Баланс в рублях : " + balance);
    }
}
