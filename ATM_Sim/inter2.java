public class inter2 {

    public static void main(String[] args) {
        C c = new C ();
        c.fun();
        

    }
    
}


interface A{
    default void fun (){
        System.out.println("Implementing A");
    }
}

class B {                                       // resolution priority java pritorize class over interface 
    void fun(){
        System.out.println("Implementing B ");  
    }
}

class C extends B implements A{
     public void fun (){
    super.fun();
    //System.out.println("Inside C ");

    }
}