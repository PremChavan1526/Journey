

public class typepara {


    public static void main(String[] args) {



    Box <Integer> b = new Box <Integer>(10);    //type arguement
    Box <String> b2  = new Box<> ("Hello");
    Box <Boolean> b3 = new Box<> (false);

    System.out.println(b.getValue() + 5);
    System.out.println(b2.getValue());
    System.out.println(b3.getValue());
        
    }
    
}


class Box <T> {    // type parameter

    private T value;


    Box(T value){
         this.value = value;
    }


    public T getValue (){

        return this.value;

    }
        public void setValue(T value){
             this.value = value;

        }

}
