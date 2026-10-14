package day2.ALL;

public class Student {

    String name;
    int age;
    String course;

    String empName;
    int empId;
    double salary;
    String department;

    public  static void  main (String[] args) {
        System.out.println("Hello World");


        

        Student s1= new Student();
        s1.name = "Prem";
        s1.age = 21;  
        s1.course = "B.Tech";

        Student s2= new Student();
        s2.name = "Ravi";   
        s2.age = 22;
        s2.course = "B.Sc";
        

        Student s3= new Student();
        s3.name = "Anita";
        s3.age = 20;
        s3.course = "B.Com";



        Student s4  = new Student();
        s4.empName = "John";
        s4.empId = 101; 
        s4.salary = 50000.0;
        s4.department = "IT";

        System.out.println("Employee Name: " + s4.empName);
        System.out.println("Employee ID: " + s4.empId); 
        System.out.println("Salary: " + s4.salary);
        System.out.println("Department: " + s4.department);

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);   
        System.out.println("Course: " + s1.course);

        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);   
        System.out.println("Course: " + s2.course);


        System.out.println("Name: " + s3.name);
        System.out.println("Age: " + s3.age);   
        System.out.println("Course: " + s3.course);
        




    }
   

    
}
