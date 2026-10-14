package day2;

public class consto {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Arjit", 35, 0101, "IIT");

         System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.clgName);

           System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNum);
        System.out.println(s2.clgName);
    }
        


    }
    



class Student {

    String name;
    int age;
    int rollNum;
    String clgName;

    Student ()                          //chaining implemented succesfully here 
    {
        this("Unknown");                    //this should be the first line of the constructor
                                                    //  Constructor can only be called by  creating object or by using this keyword
                                                        // Constructor cannot be called manually

        System.out.println("first constructor");
    }

    Student(String name){
        this(name, 0);
        

        System.out.println("this is the second constructor");
    }

    Student(String name, int age){
        this(name, age , 0);

        System.out.println("third constructor");
    }

    Student(String name, int age, int rollNum){
        this(name, age, rollNum, "Unknown");

        System.out.println("fourth constructor");

    }

    Student (String name, int age , int rollNum , String clgName){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.clgName = clgName;

    }
   
}
