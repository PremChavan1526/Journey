public class ob1 {

    public static void main(String[] args) {
        

        Student s1 = new Student();
        s1.name = "Prem";
        s1.age = 20;

        System.out.println(s1);


    }
    
}


class Student {
String name;
int age;


@Override 
public String toString(){               // toString method implemented here  
    return (name + " , " + age);


}

}