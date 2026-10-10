package day2;

public class Mainpay {

    public static void main(String[] args) {
        Payment p1 = new Upi();
        Payment p2 = new creditCard();
        Payment p3 = new Paypal();


        p1.pay(2000);
        p2.pay(30000);
        p3.pay(23000);

    }
    
}
