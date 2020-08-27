package com.JavaFundamentals;

public class SeperateEvenAndOdd {
    public static void main(String[] args) {
        int i = 0;
        int j = args.length - 1;

        for (int k = 0; k < args.length; k++) {
            while (Integer.parseInt(args[i]) % 2 == 0)
                i++;
            while (Integer.parseInt(args[j]) % 2 == 1)
                j--;

            if (i < j) {
                String temp = args[i];
                args[i] = args[j];
                args[j] = temp;
            }
        }
        for (String string : args) {
            System.out.print(string + " ");
        }

    }
}
