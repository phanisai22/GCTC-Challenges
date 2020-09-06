package com.javafundamentals;

public class PrintAllAsciiValues {
    public static void main(String[] args) {
        int[] asciiArray = new int[127];
        for (int i = 0; i < asciiArray.length; i++) {
            char c = (char) i;
            System.out.println(c);
        }
    }

}
