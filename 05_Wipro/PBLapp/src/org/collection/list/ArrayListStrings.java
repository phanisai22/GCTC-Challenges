package org.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An ordered collection of months in a year.
 * 
 * @author Phani Sai
 * @see Collection
 * @see ArrayList
 * @see Iterator
 * @version 1.0
 */

public class ArrayListStrings {

    /**
     * An array of all the months in a year.
     */
    public static List<String> months;

    /**
     * Prints the name of months in a year.
     * @param args 
     */
    public static void printAll(){
        Iterator<String> iter = months.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    /**
     * Initialize months.
     * @param args
     */

    public static void main(String[] args) {

        months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        printAll();
    }
}
