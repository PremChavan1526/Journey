package StrCon;

import javax.swing.Box;

public class gener {
    public static void main(String[] args) {



        //as we have stored object here we have lost the type information here hence we do downcasting

        //Downcasting 
        
      box b1 = new box(10);
      box b2 = new box("Hello");
      box b3 = new box(true);


      Integer i = (Integer)b1.getValue();
      String s = (String) b2.getValue();
      Boolean b = (Boolean) b3.getValue();
      System.out.println(i + 5);
      System.out.println(s + 5);
      System.out.println(b);



    }
}


class box {

    private Object value ;


    box (Object value){
        this.value = value;
    }


    public Object getValue (){
        return value;
    }


    public void setValue(Object value){
        this.value = value;
    }
}