public class staticprac {
    

    public static void main(String[] args) {

        Student s1 = new Student("Aditya" ,21, 1);
        Student s2 = new Student("Kelvin", 3, 34);


        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNumber + " , " + Student.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNumber + " , " + s2.college);
        

    }
}


class Student{

    String name;
    int age;
    int rollNumber;
    static String college;


    Student(String name, int age, int rollNumber)
    {

        this.name = name;
        this.age = age;
        this.rollNumber= rollNumber;


    }


    //static block

    static{

        college = "IIT Bombay";
    }

}
