package com.JavaFundamentals;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] array = new int[] {23, 22, 0, -1, 506, 45};
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);
        float average = sum / array.length;
        System.out.println(average);
    }
}
