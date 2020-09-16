package com.mettle;

/**
 * original array : 2, 5, 1, 7, 9, 3 encoded array : 7, 6, 8, 16, 12, 3
 * 
 * NOTE: Last element remains unchanged.
 */

public class SimpleEncodedArray {
    public class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            this.output1 = out1;
            this.output2 = out2;
            System.out.println("First element Of original array: " + out1);
            System.out.println("Sum of original array:" + out2);
        }
    }

    public Result findOriginalFirstAndSum(int[] input1, int input2) {

        int sum = 0;
        int[] originalArray = new int[input2];
        originalArray[input2 - 1] = input1[input2 - 1];

        for (int i = input2 - 2; i > -1; i--) {
            originalArray[i] = input1[i] - originalArray[i + 1];
        }

        // System.out.println("Original Array:");
        // for (int i : originalArray) {
        //     System.out.print(i + "\t");
        // }
        // System.out.println();

        for (int i : originalArray) {
            sum += i;
        }

        return new Result(originalArray[0], sum);
    }

    public static void main(String[] args) {
        new SimpleEncodedArray().findOriginalFirstAndSum(new int[] { 7, 6, 8, 16, 12, 3 }, 6);
        new SimpleEncodedArray().findOriginalFirstAndSum(new int[] { -2, -7, -12, -15 }, 4);
        new SimpleEncodedArray().findOriginalFirstAndSum(new int[] { -10, 10 }, 2);
    }
}
