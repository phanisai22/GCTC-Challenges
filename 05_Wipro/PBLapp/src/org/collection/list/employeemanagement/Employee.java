package org.collection.employeemanagement;

/**
 * An application can store all the employee related details.
 * 
 * @author Phani Sai
 * @version 1.0
 */
public class Employee {
    /**
     * All posible employee details to store.
     */
    private int empID;
    private String empName;
    private String email;
    private String gender;
    private double salary;

    /**
     * Default constructor. (can take a {@code null} employee).
     */
    public Employee() {
    }

    /**
     * Create new employee with details provided.
     */
    public Employee(int empID, String empName, String email, String gender, double salary) {
        super();
        this.empID = empID;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Outputs the employee details to console.
     */
    public void getEmployeeDetails() {
        System.out.println("ID: " + empID + "\nName: " + empName + "\nGender: " + gender + "\nSalary: " + salary
                + "\nEmail: " + email);
    }
}
