package day2;

public class Student {

    private String name;
    private int age;
    private int marks;



    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        if (age>=5 && age<=100){
            return age;
        } else {
            System.out.println("Invalid age");
            
        }
        
    }

    public int getMarks() {
        if (marks>0 && marks<=100){
            return marks;

        }else 
            return -1;
        }
    



        public static void main(String[] args) {
            Student student1 = new Student("Alice", 20, 85);
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Marks: " + student1.getMarks());

            Student student2 = new Student("Bob", 4, 90);
            System.out.println("Name: " + student2.getName());
            System.out.println("Age: " + student2.getAge());
            System.out.println("Marks: " + student2.getMarks());

            Student student3 = new Student("Charlie", 25, 105);
            System.out.println("Name: " + student3.getName());
            System.out.println("Age: " + student3.getAge());
            System.out.println("Marks: " + student3.getMarks());
        }
    }


