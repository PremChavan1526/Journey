

public class cating {

    public static void main(String[] args) {
        

        //upcasting

        String s = "Hello";
        Object obj = s;

        System.out.println(s);


        //Downcasting
        Object obj2 = "Prem";
        String s2 = (String) obj2;
        System.out.println(s2);


        // Damgerous Downcasting   gives .ClassCastException
        Object obj3 = 10;
        String s3 = (String)obj3;

        System.out.println(s3);

    }
    
}
