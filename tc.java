class tc{

public static void main(String[] args) {
      
//explicit type casting
    int i =300;
    byte b = (byte) i;
    System.out.println(b);

//implicit
    int ab;
    char a = 'a';
    ab = a;
    System.out.println(ab);


    //Truncating conversion

    float f = 16.455f;
    int c = (int)f;
    System.out.println(c);


    byte bc = 50;
    bc =  (byte)(bc* 2);
    System.out.println(bc);
}


} 