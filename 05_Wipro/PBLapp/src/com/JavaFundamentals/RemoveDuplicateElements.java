package com.JavaFundamentals;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] array = { 12, 34, 12, 45, 67, 89 };
        int len = array.length;
        Arrays.sort(array);
        int j = 0;// for next element
        for (int i = 0; i < len - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[len - 1];

        for (int number : array) {
            System.out.print(number + "\t");
        }

    }
}
