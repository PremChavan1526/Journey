package day2;

public class Animal {



    public static void main(String[] args) {
        Animal a = new dog();
        a.eat();
        a.sound();
    }


    void eat()
    {
        System.out.println("Animal eats");
    }

    void sound()
    {
        System.out.println("Animal makes a sound");

    }
    
}


class dog extends Animal{

    @Override 
    void sound()
    {
        System.out.println("Dog barks");
    }
}


