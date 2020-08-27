package com.JavaFundamentals;

public class SumElements {
    public static void main(String[] args) {
        int len = args.length;
        int j = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (args[i].equals("6")) {
                j = i;
                while (j < len) {
                    if (args[j].equals("7")) {
                        i = j + 1;
                        break;
                    }
                    j++;
                }

            }
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }

}
