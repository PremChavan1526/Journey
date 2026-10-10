package day2.ALL;

public class Car {

    String brand;
    String model;
    int price;


    public Car() {

        System.out.println("Default constructor called. No values provided. ");


    }
        public Car(String brand, String model, int price) {
            this.brand = brand;
            this.model = model; 
            this.price = price;
    
}

public static void main(String args[]){
  

    Car c1 = new Car();

    Car c2 = new Car("Toyota", "Camry", 30000);
    System.out.println("Car 2 Brand: " + c2.brand + ", Model: " + c2.model + ", Price: " + c2.price);
}
}
