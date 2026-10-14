package day2;

public class Bank {

    String AccountHolderName;
    String AccountNumber;
    private double balance;

    public static void main(String[] args) {
       Bank obj = new Bank("John Doe", "123456789", 1000.0);
       obj.displayBalance();
       obj.deposit(500.0);
       obj.displayBalance();
         obj.withdraw(200.0);
         obj.displayBalance();

    }

    public Bank(String AccountHolderName, String AccountNumber, double balance) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.balance = balance;



    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);


    }

    public void withdraw(double amount){

        if(amount <=balance){

            amount =balance -amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    
}
