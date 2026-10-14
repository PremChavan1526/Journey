package ATM_Sim;

import java.util.Scanner;

public class Withdrawal {

    public void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        checkBalance balanceChecker = new checkBalance();

        if (amount > 0 && amount <= balanceChecker.checkbalance()) { // Placeholder for actual withdrawal logic
            System.out.println("The amount you requested is withdrawn.");
        } 
        else  System.out.println("Invalid amount!");
        


        


        }    }
