package day2;

import java.util.Scanner;

public class SafeDivision {


    public static void main(String args[]){




        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.println("Enter the denominator: ");
        int denominator = sc.nextInt();


    try{
        int result = numerator / denominator;
        System.out.println("Result: " + result);


    }catch (ArithmeticException e){
        System.out.println("Error: Division by zero is not allowed.");
    }


    finally {
        System.out.println("Execution completed.");



    }


    sc.close();
}
}