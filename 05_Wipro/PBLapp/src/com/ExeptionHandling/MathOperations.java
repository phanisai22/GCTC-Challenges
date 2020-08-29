package com.ExeptionHandling;

public class MathOperations {

    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Enter 5 number only.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            try {

                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                return;
            }

        }
        try {
            System.out.println("Average : " + (sum / 5));
        } catch (ArithmeticException w) {
            System.out.println(w.getMessage());
        }
    }
}
