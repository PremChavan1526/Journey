package day2.ALL;

import java.security.Permission;

public class Employee {

    private String name;
    private String department;
    private double salary;
    static int Employecount = 0;

    public Employee(String name, String department, double salary){

        this.name = name;
        this.department = department;
        this.salary = salary;

        Employecount++;
    }



    public static int getEmployecount() {
        return Employecount;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    

}
