import java.util.ArrayList;
import java.util.List;

public class demo6 {


    //Understanding generics using super (Lower bound)
    
    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
        
    }

    public static void fun (List < ? super Animal > values){

        //writing
        values.add(new Animal());


        //Reading
        for(Object obj :values){

            Animal a = (Animal) obj;
            a.eat();

            
        }


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