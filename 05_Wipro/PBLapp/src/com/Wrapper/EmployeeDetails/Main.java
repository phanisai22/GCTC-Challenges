package com.Wrapper.EmployeeDetails;

public class Main {
    public static void main(String[] args) {
        Employee employeeOriginal = new Employee("Phani sai", "17R11A05E0", "Temp.mail@proton.com");
        System.out.println(employeeOriginal.toString());
        try {
            Employee employeeClone = (Employee)employeeOriginal.clone();
            System.out.println(employeeClone.toString());

            System.out.println("Made changes in cloned class");
            employeeClone.setEmail("Changed.mail@gmail.com");
            employeeClone.setId("123455566");
            System.out.println(employeeClone.toString());
        } catch (CloneNotSupportedException e) {
            System.out.println("Implement clonable for the class to clone.");
        }

        
    }
}
