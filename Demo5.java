

public class Demo5 {

    public static void main(String[] args) {

        String y = getResult("Hello");
        System.out.println(y);


            PrintPair(23, "Prem");
            //Type inference


        
    }


    public static <T> T getResult(T x){     //Type parameter in the methods also


        return x;
    }
    


    public static <T , U> void PrintPair(T first, U second){

        System.out.println( first  + " , " + second);

    }
}


//Generic methods 
// <T> return type  and method name (T  parameter )    how to use generic in methods