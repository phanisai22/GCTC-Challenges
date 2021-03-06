package com.ioOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFiles {

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = "Dummy";
        String outputFileName = "Dummy";
        final String path = "/home/user0022/Github/GCTC-Challenges/05_Wipro/PBLapp/src/com/ioOperations/";

        try {
            System.out.println("Enter the input file name : "); // input1.txt
            inputFileName = bf.readLine();
            System.out.println("Enter the output file name : ");
            outputFileName = bf.readLine();
        } catch (IOException e) {
            System.out.println("Enter a valid input.");
        }

        try {

            File in = new File(path + "/" + inputFileName);
            File out = new File(path + "/" + outputFileName);
            FileReader fi = new FileReader(in);
            FileWriter fo = new FileWriter(out);
            try {
                int c;
                while ((c = fi.read()) != -1)
                    fo.write((char) c);

                System.out.println("File is copied");
                fi.close();
                fo.close();

            } catch (IOException ae) {
                System.out.println("Error reading or writing file");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + inputFileName);
        } catch (IOException ae) {
            System.out.println("Error opening writing file");
        }
    }
}
