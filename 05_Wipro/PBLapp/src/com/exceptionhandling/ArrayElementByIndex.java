package com.exceptionhandling;

import java.util.Scanner;

public class ArrayElementByIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Number of elements in the array");
            int len = sc.nextInt();
            System.out.println("Enter the Elements in the array");
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Enter the index of the element you want to access");
            int index = sc.nextInt();

            sc.close();

            try {
                System.out.println("The array element at index " + index + " = " + array[index]);
                System.out.println("The array element successfully accessed");
            } catch (IndexOutOfBoundsException b) {
                System.out.println("java.lang.NumberFormatException");
            }
        } catch (NumberFormatException a) {
            System.out.println("java.lang.ArrayOutOfBoundsException");
        }
    }
}
