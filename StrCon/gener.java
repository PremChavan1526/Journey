package StrCon;

import javax.swing.Box;

public class gener {
    public static void main(String[] args) {



        //as we have stored object here we have lost the type information here hence we do downcasting

        //Downcasting 
        
    //   box b1 = new box(10);
    //   box b2 = new box("Hello");
    //   box b3 = new box(true);


    //   Integer i = (Integer)b1.getValue();
    //   String s = (String) b2.getValue();
    //   Boolean b = (Boolean) b3.getValue();
    //   System.out.println(i + 5);
    //   System.out.println(s + 5);
    //   System.out.println(b);


    box <Integer>  i = new box<>(10);
    System.out.println(i.getValue());



    }
}


class box <T>{              //type parameter

    // private Object value ;
    private T value ;


    box (T value){
        this.value = value;
    }


    public T getValue (){
        return value;
    }


    public void setValue(T value){
        this.value = value;
    }
}