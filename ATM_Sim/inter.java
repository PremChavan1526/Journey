public class inter {


    public static void main(String[] args) {

        D d = new D();
        d.fun();
        
    }

    
}


interface A {
    default void fun(){                     // with this we can define methods in  the interface 
            System.out.println("Default method implemented");

    }


}

interface B {
    void fun();

}


interface C {
    void fun();


}


class D implements A,B,C{

    public void fun(){
System.out.println("Implemented D here");

        A.super.fun();

    }
}