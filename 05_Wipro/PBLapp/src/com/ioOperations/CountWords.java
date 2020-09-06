package com.ioOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CountWords {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Enter two file names ONLY");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];
        final String path = "/home/user0022/Github/GCTC-Challenges/05_Wipro/PBLapp/src/com/ioOperations/";
        Map<String, Integer> wordCounts = new HashMap<>();

        try {

            File in = new File(path + "/" + inputFileName);
            File out = new File(path + "/" + outputFileName);
            FileReader fi = new FileReader(in);
            FileWriter fo = new FileWriter(out);
            BufferedReader br = new BufferedReader(fi);

            String eachLine;
            while ((eachLine = br.readLine()) != null) {
                String[] words = eachLine.split(" ");
                for (String word : words) {
                    if (wordCounts.containsKey(word)) {
                        int temp = wordCounts.get(word);
                        wordCounts.put(word, temp + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }

            List<Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());
            Collections.sort(entries, (a, b) -> a.getKey().compareTo(b.getKey()));

            for (Entry<String, Integer> entry : entries) {
                fo.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }
            
            fi.close();
            fo.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + inputFileName);
        } catch (IOException ae) {
            System.out.println("Error opening writing file");
        }
    }
}
