public class str1 {
    
    

    public static void main(String[] args) {
        

        String s1 = new String("Indray");
        String s2 = new String("Indray");
        String s3 = new String("INDRAY");

        System.out.println(s1.length()); //6
        System.out.println(s1.isEmpty()); //false
        System.out.println(s1.isBlank());  //false

  
        //character 
        char[] arr = s1.toCharArray();
          System.out.println(arr[2]);     //d


          //Comparison
          System.out.println(s1==s2);  //false
          System.out.println(s1.equals(s2));  //true
          System.out.println(s1.equalsIgnoreCase(s3));
          System.out.println(s1.compareTo(s3));


          //searching

          System.out.println(s1.contains(" dra"));



          //Toseparate 


          String s4 = new String("Prem , Om , Indray ");
          String[] arr1 = s4.split(",");

          for (String string : arr1) {
                    
            System.out.println(string);
          }



          //join

          System.out.println(String.join("-", "a","b","c"));
    }
}
