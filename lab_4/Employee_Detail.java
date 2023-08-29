package programs.lab_4;

import java.util.*;

public class Employee_Detail {
    private int employeeID;
    private String name;
    private String designation;
    private double salary;

    public Employee_Detail(int employeeID, String name, String designation, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = scanner.nextInt();

        System.out.print("Enter Name: ");
        scanner.nextLine();
        String empName = scanner.nextLine();

        System.out.print("Enter Designation: ");
        String empDesignation = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double empSalary = scanner.nextDouble();

        Employee_Detail employee = new Employee_Detail(empID, empName, empDesignation, empSalary);
        employee.displayDetails();

        scanner.close();
    }
}
