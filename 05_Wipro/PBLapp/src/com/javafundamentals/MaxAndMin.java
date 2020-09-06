package com.javafundamentals;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = new int[] { 23, 22, 0, -1, 506, 45 };
        int max = array[0];
        int min = array[0];

        for (int number : array) {
            if (max < number)
                max = number;
            if (min > number)
                min = number;
        }

        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);

    }

}
