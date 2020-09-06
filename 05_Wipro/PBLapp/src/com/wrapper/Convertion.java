package com.wrapper;

public class Convertion {

    public static void main(String[] args) {
        if (args.length < 1 || args.length > 1){
            System.out.println("Invalid Input");
            return;
        }
        int value = Integer.parseInt(args[0]);
        System.out.println("Given Number: "+value);
        System.out.println("Binary equivalent: "+Integer.toBinaryString(value));
        System.out.println("Octal equivalent: "+Integer.toOctalString(value));
        System.out.println("Hexadecimal equivalent: "+Integer.toHexString(value));
    }
}
