import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class inputst {


    public static void main(String[] args) throws IOException {

     InputStreamReader isr = new InputStreamReader(System.in);          //created a object of input stream which will take in input
    

     BufferedReader br = new BufferedReader(isr);   // we have made a buffer which will read input and store in buffer

     String name = br.readLine();

     System.out.println(name);

        
    }
    
}
