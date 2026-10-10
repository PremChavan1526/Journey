package day2;

public interface Payment {
    

    void pay(double amount);
}



class Upi implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using UPI.");
    }
}



class creditCard implements Payment{


    @Override
    public void pay(double amount){

        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
}



class Paypal implements Payment{

    @Override 
    public void pay(double amount){


    System.out.println("Payment of " + amount + " made using paypal");
    }


}








