package com.JavaFundamentals;

import java.util.Arrays;

public class LargestTwoSmallestTwo {
    public static void main(String[] args) {
        int[] array = { 22, 23, -1, 0, 45, 506 };
        int len = array.length;
        Arrays.sort(array);
        System.out.println("Largest Two : " + array[len - 1] + " " + array[len - 2]);
        System.out.println("Smallest Two : " + array[0] + " " + array[1]);
    }
}
