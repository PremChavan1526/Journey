package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayCheck {
    
    public static void main(String[] args){


        int arr[] = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = sc.nextInt();


        try {

            System.out.println("The index is " +  arr[num]);

            
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {

            System.out.println("Invalid index number");
            // TODO: handle exception
        }

        finally{

            System.out.println("The program executed");
        }
        
        sc.close();

    }
}
