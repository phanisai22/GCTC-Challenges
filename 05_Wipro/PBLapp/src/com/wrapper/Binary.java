package com.wrapper;

public class Binary {

    public static void main(String[] args) {
        if (args.length < 1 || args.length > 1){
            System.out.println("Invalid Input");
            return;
        }

        int value = Integer.parseInt(args[0]);
        if ( value < 1 && value > 255){
            System.out.println("Out of range (1 - 255)");
            return;
        }

        System.out.println(String.format("%8s",Integer.toBinaryString(value)).replace(" ", "0"));
    }
}
