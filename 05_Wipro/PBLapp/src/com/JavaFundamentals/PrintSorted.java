package com.JavaFundamentals;

import java.util.Arrays;

public class PrintSorted {
    public static void main(String[] args) {
        int[] array = { 22, 23, -1, 0, 45, 506 };
        Arrays.sort(array);
        for (int number : array) {
            System.out.print(number + ", ");
        }
    }
}
