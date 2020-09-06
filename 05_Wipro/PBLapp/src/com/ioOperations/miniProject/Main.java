package com.ioOperations.miniProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    private static int count = 0;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final String path = "/home/user0022/Github/GCTC-Challenges/05_Wipro/PBLapp/src/com/ioOperations/miniProject/data";

    public static void main(String[] args) throws IOException {
        int choice = 1;

        do {
            printOptions();
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    if (createEmployee()) {
                        System.out.println("Successfully added.");
                    }
                    break;
                case 2:
                    printEmployees();
                    break;
                case 3:
                    System.out.println("Exiting the System.");
                    break;
                default:
                    System.out.println("Enter valid option.");
            }

        } while (choice != 3);
    }

    private static void printOptions() {
        System.out.println("\n *** Main Menu ***\n\t1. Add an Employee\n\t2. Display All\n\t3. Exit\n");
    }

    private static boolean createEmployee() {
        int id, age;
        String name;
        double salary;

        try {
            System.out.println("Enter Employee ID: ");
            id = Integer.parseInt(br.readLine());
            System.out.println("Enter Employee name: ");
            name = br.readLine();
            System.out.println("Enter Employee age: ");
            age = Integer.parseInt(br.readLine());
            System.out.println("Enter Employee salary: ");
            salary = Double.parseDouble(br.readLine());

        } catch (IOException e) {
            System.out.println("Invalid request");
            return false;
        }

        Employee employee = new Employee(id, name, age, salary);
        try {
            FileOutputStream out = new FileOutputStream(path + count + ".txt");
            ObjectOutputStream s = new ObjectOutputStream(out);
            s.writeObject(employee);
            count++;
            s.close();
            s.flush();
        } catch (IOException ee) {
            System.out.println("Error writing file");
            return false;
        }

        return true;
    }

    private static void printEmployees() {
        int c = 0;
        System.out.println("---Report---");
        try {
            while (true) {
                FileInputStream in = new FileInputStream(path + c + ".txt");
                ObjectInputStream s = new ObjectInputStream(in);
                Employee employee = (Employee) s.readObject();
                System.out.println(employee.toString() + "\n");
                s.close();
                c++;
            }
        } catch (IOException ee) {

        } catch (ClassNotFoundException ec) {
            System.out.println("Class Not Found");
        }
        System.out.println("---End Report---");
    }
}
