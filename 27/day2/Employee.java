package day2;

public class Employee {

    private String name;
    private int id;
    private double salary;
    private String department;
    private static int employeeCount=0;

    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id=id;
        this.salary=salary;
        this.department=department;
        
        employeeCount++;





    }
    
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }


    public static int getEmployeeCount(){
        return employeeCount;
    }


    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Department: " + department);
    }

    public void CalculateAnnualSalary() {
       double annuallSalary = salary*12;
       System.out.println("Annual Salary: " + annuallSalary);
    }

    public void getBonnus(){
        double bonus = salary* 0.1;
        System.out.println("Bonus: " + bonus);
    
    
    }

    public static void main(String[] args) {

        System.out.println("Employee Management System");
        System.out.println("The total number of employee is :" + Employee.getEmployeeCount());
        Employee emp1 = new Employee("John Doe", 101, 5000.0, "IT");
        emp1.displayEmployeeDetails();
        emp1.CalculateAnnualSalary();
        emp1.getBonnus();

        Employee emp2 = new Employee("Jane Smith", 102, 6000.0, "HR");
        emp2.displayEmployeeDetails();
        emp2.CalculateAnnualSalary();
        emp2.getBonnus();

        System.out.println("Total Employees: " + Employee.getEmployeeCount());
    }
}