package com.mettle;

/**
 * Find the sum of difference between first letter and the last letter, second
 * letter and the second last letter and so on till the center of the word.
 * 
 * (a = 1, b = 2, c = 3 ... z = 26)
 * 
 * ONLY SPACE SEPERATED WORDS AND VALUES OF 'a' AND 'A' ARE SAME.
 * 
 * example: 
 * WORLD = [W-D] + [O-L] + [R] = [23-4] + [15-12] + [18] = [40] 
 * WIDE = [W-E] + [I - D] = [23-5] + [9-4] = [18] + [5] = [23] 
 * WEB = [W-E] + [E] = [23-2] + [5] = [26]
 * 
 * Concatination: [40][23][26] [402326]
 */

public class FindStringCode {

    public int findStringCode(String input1) {
        String[] words = input1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(findWordCode(word.toLowerCase()));
        }
        return Integer.parseInt(sb.toString());
    }

    public String findWordCode(String word) {
        int len = word.length();
        long result = 0;
        for (int i = 0; i < (int) len / 2; i++) {
            int start = word.charAt(i) - 'a' + 1;
            int end = word.charAt(len - i - 1) - 'a' + 1;
            result = result + Math.abs(start - end);
        }

        // Above loop runs for even length of words. Example: For word WORLD the above
        // loop skips'R'(Middle/Median Letter). So we add letter 'R' placed at
        // lengthOfWord/2 if length of word is ODD.
        if (len % 2 != 0) {
            result += word.charAt((int) len / 2) - 'a' + 1;
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(new FindStringCode().findStringCode("World Wide Web"));
        // System.out.println(new FindStringCode().findStringCode("ab  & ab ab"));
        System.out.println();
    }
}
