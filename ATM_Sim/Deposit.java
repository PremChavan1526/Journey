package ATM_Sim;

import java.util.*;

public class Deposit {

    public void dodeposit() {
        Scanner sc = new Scanner(System.in); // Keeps reading from the system input

        System.out.println("Enter the amount to deposit:");
        int amount = sc.nextInt();
        
        if (amount > 0) {
            System.out.println("The amount you inserted (" + amount + ") is deposited.");
        } else {
            System.out.println("Invalid amount! Deposit must be greater than 0.");
        }

        
    }
}
