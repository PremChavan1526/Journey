package day2;





   



public class Vehicle {




   private String brand;
    private String model;
    private int price;




    Vehicle(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }




    
}



class Car extends Vehicle{


    int numberOfDoors;



    Car(String brand, String model, int price, int numberOfDoors){

super(brand,model,price);
this.numberOfDoors = numberOfDoors;

    }


    @Override 
    public void start() {
        System.out.println("Car is starting");
    }


    



    @Override 
    public void displayDetails(){

        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }



}




class Bike extends Vehicle{

int engineCapacity;


Bike(String brand, String model, int price, int engineCapacity) {
    super(brand, model, price);
    this.engineCapacity = engineCapacity;
}

@Override 
public void start() {
    System.out.println("Bike is starting");




}






@Override 
public void displayDetails() {

    super.displayDetails();
    System.out.println("Engine Capacity: " + engineCapacity);

}
}



class Truck extends Vehicle{

    int loadCapacity;

    Truck(String brand, String model, int price, int loadCapacity) {
        super(brand, model, price);
        this.loadCapacity = loadCapacity;
    }

    @Override 
    public void start() {
        System.out.println("Truck is starting");
    }


   


    @Override 


    public void displayDetails(){

        
            super.displayDetails();

            System.out.println("Load Capacity: " + loadCapacity);



    }

}





    