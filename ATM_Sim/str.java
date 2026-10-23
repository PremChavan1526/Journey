public class str {


    public static void main(String[] args) {
        

        String s = "Hello";    // compile time
        String s1 = s + " World";   //run time

        System.out.println(s==s1);  //false

        String a = "Hello";          //Literals
        String b = new String("Hello");   //new (Object)

        System.out.println(a==b);
        



        String c = "Hello";
        String d = "Hello";
        System.out.println(c==d);    //true


        String e = new String("Hello");
        String f = new String("Hello"); 
        System.out.println(e==f);        //here its is pointing to the refernce 
        System.out.println(e.equals(f));     //here it is comparing the value of the reference .
    }
    
}
