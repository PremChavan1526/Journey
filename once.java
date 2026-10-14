public class once {


    public static void main(String[] args) {
        

        // intergers here 


        // we can also represent this using octal, binary,hexadecimal numbers here
        // byte b = 0b5; octal 
        //byte b = 05;   binary
        // byte b = 0x5;  hexadecimal

        byte b = -10;
        short s = 250;
        int i = 1000;
        long l = 3456789;

        // Real Numbers

        float f = 23.60f;

        System.out.printf( "%.20f", f); 
        System.out.println("\n");   ////
        
        double d = 2345.765;   /// today's machine are more optimised for double



        // characters  character --> interger --> store



        char a = 'A';


        // Boolean provide true or false value that is 0 or 1



        boolean bool = false;

        System.out.println("Integer values " +  b  + " , " + s +" , " + i + " , " + l );
        System.out.println("Real Numbers  "  + f + " , " + d);
        System.out.println("Character values  "  + a );
        System.out.println("Boolean Values " + bool);


    }
    
}
