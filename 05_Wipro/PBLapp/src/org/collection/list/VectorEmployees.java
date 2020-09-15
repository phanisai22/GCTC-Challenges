package org.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.collection.employeemanagement.Employee;

/**
 * Testing vector which is capable of storing Employee objects from package
 * org.collection.employeemanagement.
 * 
 * @author Phani Sai
 * @see Collection
 * @see Vector
 * @see Iterator
 * @version 1.0
 */

public class VectorEmployees {

    /**
     * An Vector of Employees.
     */
    public static List<Employee> employees;

    /**
     * Prints all the Employee details.
     * 
     * @param args
     */
    public static void printAll() {
        Iterator<Employee> iter = employees.iterator();
        while (iter.hasNext()) {
            Employee tEmployee = iter.next();
            tEmployee.getEmployeeDetails();
            System.out.println("+++++++++++++++++++++++++");
        }
    }

    /**
     * Initialize Employees.
     * 
     * @param args
     */

    public static void main(String[] args) {

        employees = new Vector<Employee>();
        Employee e1 = new Employee(22, "John snow", "IKnowNothing@got.com", "Male", 66000);
        Employee e2 = new Employee(1, "Cersei", "PowerIsPower@got.com", "Female", 126000);
        Employee e3 = new Employee();
        Employee e4 = new Employee(3, "Tyrion", "ILikeWine@got.com", "Male", 0);
        Employee e5 = new Employee(23, "Daenerys", "MyReignHasJustBegan@got.com", "Female", 126000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        printAll();
    }
}
