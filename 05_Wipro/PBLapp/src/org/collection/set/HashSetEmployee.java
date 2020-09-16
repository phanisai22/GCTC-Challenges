package org.collection.set;

import java.util.HashSet;
import java.util.Iterator;

import org.collection.list.employeemanagement.Employee;

/**
 * An unordered collection of employees.
 * 
 * @author Phani Sai
 * @see Collection
 * @see HashSet
 * @version 1.0
 */

public class HashSetEmployee {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();
        Employee e1 = new Employee(22, "John snow", "IKnowNothing@got.com", "Male", 66000);
        Employee e2 = new Employee(1, "Cersei", "PowerIsPower@got.com", "Female", 126000);
        Employee e3 = new Employee();
        Employee e4 = new Employee(3, "Tyrion", "ILikeWine@got.com", "Male", 0);
        Employee e5 = new Employee(23, "Daenerys", "MyReignHasJustBegan@got.com", "Female", 126000);

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iter = set.iterator();
        while (iter.hasNext()) {
            Employee emp = (Employee) iter.next();
            emp.getEmployeeDetails();
            System.out.println("++++++++++++++++++++++++++++");
        }
    }

}
