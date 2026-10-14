

public class bounds {


    public static void main(String[] args) {


        Box<Integer> b= new Box<>();
        b.value =5;
        b.printDouble();

        

    }


    
}


class Box<T extends Number>{

     T value;

    public void printDouble(){
        

   
    System.out.println( value.doubleValue());




}
}