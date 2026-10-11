package ATM_Sim;

public class checkBalance {

    public int checkbalance() {
        int amount = 1000; // Placeholder for actual balance retrieval logic
        amount = amount + dodeposit(); // Assuming deposit method returns the deposited amount
        

        System.out.println("Your current balance is:" + amount);
        return amount;
    }
    
}
