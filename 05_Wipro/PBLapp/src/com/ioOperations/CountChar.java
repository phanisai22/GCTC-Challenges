package com.ioOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChar {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "Dummy";
        int findChar = '~';
        int count = 0;
        final String path = "/home/user0022/Github/GCTC-Challenges/05_Wipro/PBLapp/src/com/ioOperations/";

        try {
            System.out.println("Enter the file name : "); // input1.txt
            fileName = bf.readLine();

        } catch (IOException e) {
            System.out.println("Enter a valid input.");
        }

        try {

            File in = new File(path + "/" + fileName);
            FileReader fi = new FileReader(in);
            try {
                System.out.println("Enter character to be counted: ");
                findChar = bf.read();
                int c;
                while ((c = fi.read()) != -1)
                    if ((char) findChar == ((char) c - ('a' - 'A')) || (char) findChar == ((char) c + ('a' - 'A'))
                            || (char) c == (char) findChar)
                        count++;
                fi.close();
            } catch (IOException ae) {
                System.out.println("Error reading file");
            }

            System.out.println("File " + fileName + " has " + count + " instances of letter '" + (char) findChar + "'");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

}
