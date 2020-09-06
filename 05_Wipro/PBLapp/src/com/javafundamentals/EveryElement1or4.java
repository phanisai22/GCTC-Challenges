package com.javafundamentals;

public class EveryElement1or4 {

    public static void main(String[] me) {
        String[] args = { "1", "4", "1", "1" };
        int len = args.length;
        boolean res = true;
        for (int i = 0; i < len; i++) {
            if (args[i].equals("1"))
                continue;
            if (args[i].equals("4"))
                continue;
            res = false;
        }
        System.out.println(res);
    }
}
