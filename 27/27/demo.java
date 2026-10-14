import java.util.ArrayList;
import java.util.List;

public class demo {


    public static void main(String[] args) {
        //Invariant in generics
        // Animal animal = new Dog();
        // animal.eat();
        // animal.walk();


        // List<Dog> dog= new ArrayList<>();
        // List<Animal> animals = dog;

        List <Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        
        
    }
    
}

class Animal{

    void eat()
    {
        System.out.println("Eating");
    }


    void walk(){

        System.out.println("Walking");
    }
}



class Dog extends Animal{


    void Bark(){

        System.out.println("Barking");
    }
}
