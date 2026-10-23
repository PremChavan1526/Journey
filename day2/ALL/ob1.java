public class ob1 {

    public static void main(String[] args) {
        

        Student s1 = new Student("Prem" , 20);
        


         

        System.out.println(s1);
        // System.out.println(s1.name .equals(s2.name));

        // for hashcode we can 
        //s1.hashcode() == s2.hashcode()


    }
    
}


class Student extends Object{
String name;
int age;

Student(String name , int age)
{
    this.name = name;
    this.age = age;
}

@Override 
public String toString(){               // toString method implemented here  
    return (name + " , " + age);


}

@Override 
public boolean equals (Object obj){

    Student s = (Student)obj;

    return (s.name.equals(this.name) && s.age == this.age);
    }

}