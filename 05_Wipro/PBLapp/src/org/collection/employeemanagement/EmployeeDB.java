package org.collection.EmployeeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Provides storage for employee list.
 * Implements all employee operations and also displays the stored employee details.
 * 
 * @author Phani Sai
 * @see Employee
 * @version 1.0
 */

public class EmployeeDB {

    /**
     * Default initial list.
     */
    private List<Employee> list;

    /**
     * Constructs an empty list.
     */
    public EmployeeDB() {
        this.list = new ArrayList<>();
    }

    /**
     * Adds an employee to the list.
     * 
     * @param employee the employee details
     * @return true if successfully added else false
     */
    public boolean addEmployee(Employee employee) {
        try {
            list.add(employee);
        } catch (UnsupportedOperationException | ClassCastException | NullPointerException
                | IllegalArgumentException e) {
            System.out.println("Error adding Employee.");
        }
        return true;
    }

    /**
     * Deletes the employee entry with provided employee id from the list.
     * 
     * @param id the id of an employee to be removed from the list
     * @return true if deletion is successful else false
     */
    public boolean deleteEmployee(int id) {

        try {
            Employee tEmployee;
            Iterator<Employee> iter = list.iterator();
            while (iter.hasNext()) {
                tEmployee = (Employee) iter.next();
                if (tEmployee.getEmpID() == id) {
                    iter.remove();
                    System.out.println("Successfully removed: " + tEmployee.getEmpName());
                    return true;
                }
            }

        } catch (UnsupportedOperationException | IllegalStateException e) {
            System.out.println("Error deleting Employee.");
        }
        System.out.println("Not Found: " + id);
        return false;
    }

    /**
     * Generates the pay-slip (due salary) of the employee.
     * 
     * @param id the id of an employee to get his salary.
     * @return a string with details on employee' s pay-slip.
     */
    public String showPaySlip(int id) {
        double paySlip = 0;
        try {
            Employee tEmployee;
            Iterator<Employee> iter = list.iterator();
            while (iter.hasNext()) {
                tEmployee = (Employee) iter.next();
                if (tEmployee.getEmpID() == id) {
                    paySlip = tEmployee.getSalary();
                }
            }

        } catch (UnsupportedOperationException | IllegalStateException e) {
            System.out.println("Error findng payslip.");
        }

        return "Payment Due" + paySlip;
    }

    /** 
     * Prints all the entries in the list.
     */
    public void printAll(){
        for (Employee employee : list) {
            employee.getEmployeeDetails();
            System.out.println("+++++++++++++++++");
        }
    }

}
