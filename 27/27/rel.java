

public class rel {



    public static void main(String[] args) {
        

        //relational operator


        ///comparing 
        
        int a = 5;  // 00000101
        int b =6;   // 00000110
        int ca =8;
        boolean c = a==b;
        System.out.println(c);  //false

        boolean d = a!=b;
        System.out.println(d);  //true


        // using bitwise and relational operator at once
        boolean e = (a<b) && (b < ca) ;   //short circuit here and implmented succesfully
        System.out.println(e);


        //left shift
        int h = 8;
        h = h<<4;
        System.out.println(h);  // works only with int and long and shfts left 4 times increasing the number 


        int l = a^b;
        System.out.println(l);   //exor operator gives 3 as output
    }
    
}
