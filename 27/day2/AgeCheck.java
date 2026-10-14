package day2;

import java.util.Scanner;



class InvalidAgeException extends Exception{

    


    public InvalidAgeException() {
    }

    InvalidAgeException(String message){

        super(message);
    }
}

public class AgeCheck {


    int Age;


    public void CheckAge(int age) throws InvalidAgeException{

        this.Age = age;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Age");
        // int Age = sc.nextInt();



       if (Age<18) {
        throw new InvalidAgeException ("The age " + age + " is invalid ");
        
       }
       else {
        System.out.println("The age is valid");
       }




       
        

    }

    public static void main(String[] args) {
        
        AgeCheck ag = new AgeCheck();
        try{
        ag.CheckAge(19);}

        catch (InvalidAgeException e){

            System.out.println("Invalid age");

            
        }

            
    }


    
}
