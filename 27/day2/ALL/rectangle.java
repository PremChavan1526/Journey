package day2.ALL;

public class rectangle {
    int length = 5;
    int breadth = 3 ;

    public static void main(String[] args) {
       rectangle obj = new rectangle();
       System.out.println("Area of rectangle: " + obj.area());
       System.out.println("Perimeter of rectangle:" +obj.perimeter());
    }

    public int area (){
        return length*breadth;
    }


    public int perimeter (){
        return 2*(length+breadth);
    }
    
}
