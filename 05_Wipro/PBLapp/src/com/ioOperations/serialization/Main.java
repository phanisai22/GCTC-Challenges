package com.ioOperations.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, 02, 23);
        Employee employee = new Employee("Employee", cal.getTime(), "Wipro", 35499, "R and D");

        try {
            FileOutputStream out = new FileOutputStream("data");
            ObjectOutputStream s = new ObjectOutputStream(out);
            s.writeObject(employee);
            s.flush();
            s.close();
        } catch (IOException ee) {
            System.out.println("Error writing file");
        } 

        try {
            FileInputStream in = new FileInputStream("data");
            ObjectInputStream s = new ObjectInputStream(in);
            Employee readEmployee = (Employee)s.readObject();
            System.out.println(readEmployee.toString());
            s.close();
        } catch (IOException ee) {
            System.out.println("Error reading file");
        } 
    }

}
