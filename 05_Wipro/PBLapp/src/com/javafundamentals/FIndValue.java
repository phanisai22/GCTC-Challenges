package com.javafundamentals;

public class FIndValue {
    public static void main(String[] args) {
        int[] array = { 1, 4, 34, 56, 7 };
        int element = Integer.parseInt(args[0]);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
