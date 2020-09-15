package org.collection.list;

import java.util.List;
import java.util.Vector;

/**
 * An ordered collection of months in a year.
 * 
 * @author Phani Sai
 * @see Collection
 * @see Vector
 * @version 1.0
 */

public class VectorMonths {

    /**
     * Prints the name of months in a year.
     * @param args 
     */

    public static void main(String[] args) {

        List<String> months = new Vector<String>();
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

        for (String month : months) {
           System.out.println(month); 
        }

    }
}
