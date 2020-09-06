package com.exceptionhandling.grade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MarksException {
        Scanner sc = new Scanner(System.in);
        String[] subjects = new String[2];
        int marks1[] = new int[3];
        int marks2[] = new int[3];
        System.out.println("enter subject names:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Subject " + i + ":");
            subjects[i] = sc.next();
            sc.nextLine();
        }
        try {

            System.out.println("Enter your marks for subject " + subjects[0]);
            for (int i = 0; i < 3; i++) {
                marks1[i] = sc.nextInt();
                if (marks1[i] < 0 || marks1[i] > 100) {
                    sc.close();
                    throw new MarksException("Valid Marks : (0 - 100)");
                }
            }
            System.out.println("Enter your marks for subject " + subjects[1]);
            for (int i = 0; i < 3; i++) {
                marks2[i] = sc.nextInt();
                if (marks2[i] < 0 || marks2[i] > 100) {
                    sc.close();
                    throw new MarksException("Valid Marks : (0 - 100)");
                }
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Enter an integer only.");
            sc.close();
        }

        System.out.println("average in subject " + subjects[0] + ":" + ((marks1[0] + marks1[1] + marks1[2]) / 3));
        System.out.println("average in subject " + subjects[1] + ":" + ((marks2[0] + marks2[1] + marks2[2]) / 3));

        sc.close();
    }
}
