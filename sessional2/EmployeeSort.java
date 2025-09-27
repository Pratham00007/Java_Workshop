import java.util.Arrays;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Get salary
    public double getSalary() {
        return salary;
    }

    // Employee Detils
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        // Create an array of employees
        Employee[] employees = {
            new Employee(101, "Akshat", 95000),
            new Employee(102, "Piyush", 25000),
            new Employee(103, "manish", 60000),
            new Employee(104, "Aman", 30000),
            new Employee(105, "Nayan", 75000)
        };

        
        // Sorting using lambda expression
        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        // Display after sorting
        System.out.println("\nAfter Sorting (by Salary Descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

