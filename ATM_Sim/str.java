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





        /// In strings we use byte takes 1 byte to store the data internally as it is very effecient and uses less space 
        /// before java 9 we use char to store the data but it was inefficient takes 2 byte
        /// we have byte , coder, hash methods in String that helps to distinguish between ASCII and UNICODE without any problem and we also have hash to store the hash code of the String inserted
        /// java is immutable to reduce and avoid cluttering of the data 
        /// also when we declare the String at runtime it stores data in the heap
        /// and when we declare it at Compile time it stores data in the String pool.
        ///  Strings are immutable for safety reasons and security of the code 
    }
    
}
