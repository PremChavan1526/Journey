package day2.ALL;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        System.out.println("The total number of employee is " + Employee.getEmployecount());

        

        Employee emp1 = new Employee("John Doe", "IT", 50000);
        Employee emp2 = new Employee("Jane Smith", "HR", 60000);
        System.out.println("The total number of employee is " + Employee.getEmployecount());
    }
    
}
