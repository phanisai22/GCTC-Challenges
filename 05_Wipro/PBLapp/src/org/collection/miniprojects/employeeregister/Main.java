package org.collection.miniprojects.employeeregister;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of Employees: ");
        int size = sc.nextInt();

        ArrayList<Employee> register = new ArrayList<>(size);
        for (int i = 1; i < size + 1; i++) {
            register.add(getDetails(i));
        }

        printRegister(register);
        sc.close();
    }

    private static Employee getDetails(int i) {
        Employee employee = new Employee();
        System.out.println("Enter Employee " + i + " Details:");

        System.out.println("Enter FirstName: ");
        employee.setfName(sc.next());

        System.out.println("Enter LastName: ");
        employee.setlName(sc.next());

        System.out.println("Enter Mobile Number: ");
        employee.setmNumber(Integer.parseInt(sc.next()));

        System.out.println("Enter Email ID: ");
        employee.seteMail(sc.next());

        System.out.println("Enter Address: ");
        employee.setAddress(sc.next());

        return employee;
    }

    private static void printRegister(ArrayList<Employee> list) {
        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "FirstName", "LastName", "MobileNumber", "Email",
                "Address");
        for (Employee employee : list) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", employee.getfName(), employee.getlName(),
                    employee.getmNumber(), employee.geteMail(), employee.getAddress());
        }
    }
}
