package ATM_Sim;

import java.util.Scanner;

public class main {
    
    public static void main (String[] args) {

       

        System.out.println("1. Open account");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw");
        System.out.println("4. checkbalance");
        System.out.println("5. exit");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");   
        int n = sc.nextInt();

        
while (n != 5) {
            switch (n) {
                case 1:  openAcc obj1 = new openAcc();
                obj1.open();
                    
                    break;
                case 2:  Deposit obj2 = new Deposit();
                obj2.dodeposit();
                    
                    break;
                case 3:  Withdrawal obj3 = new Withdrawal();
                obj3.withdraw();
                    
                    break;
                case 4:  checkBalance obj4 = new checkBalance();
                obj4.checkbalance();
                    
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
            
            System.out.println("Enter your choice:");   
            n = sc.nextInt();
        }   

       
        
    }
}
