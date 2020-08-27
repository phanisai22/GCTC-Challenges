package com.JavaFundamentals;

public class WithoutTen {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("10")) {
                if(i == args.length - 1){
                    args[i] = "0";
                    break;
                }
                args[i] = "0";
                j = i + 1;
                while (args[j].equals("10")) {
                    j++;
                }
                if (j < args.length) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        for (String string : args) {
            System.out.print(string + " ");
        }
    }
}
