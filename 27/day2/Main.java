package day2;

public class Main { 
    public static void main(String[] args) {


        Vehicle v1 = new Car("Toyota", "Camry", 25000, 4);
        Vehicle v2 = new Bike("Honda", "CBR500R", 7000, 500);
        Vehicle v3 = new Truck("Ford", "F-150", 40000, 1000);
        v1.start();
        v1.displayDetails();
        v1.stop();
        System.out.println();

        v2.start();
        v2.displayDetails();
        v2.stop();  
        System.out.println();

        v3.start();
        v3.displayDetails();
        v3.stop();


        System.out.println();
    
}
}
