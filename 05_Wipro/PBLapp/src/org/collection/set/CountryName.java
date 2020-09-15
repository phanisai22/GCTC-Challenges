package org.collection.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * An unordered collection country names.
 * 
 * @author Phani Sai
 * @see Collection
 * @see HashSet
 * @version 1.0
 */

public class CountryName {
    /**
     * The HashSet stores all the country names.(Since there are no two countries with same names we use HashSet)
     */
    HashSet<String> H1;

    /**
     * Intialize the HashSet.
     */
    public CountryName(){
        this.H1 = new HashSet<>();
    }

    /**
     * Add the country name to the HashSet(Duplicates are taken care off)
     * @param name of a country to add
     * @return
     */
    public HashSet<String> saveCountryNames(String name) {
        this.H1.add(name);
        return this.H1;
    }

    /**
     * Return name of the country if found else null.
     * @param name of a country to find
     * @return
     */
    public String getCountry(String name) {
        Iterator<String> iter = this.H1.iterator();
        while (iter.hasNext()) {
        	String countryName = iter.next();
            if (name.equals(countryName)) {
                return countryName;
            }
        }
        return null;
    }
}

/**
 * Test CountryName funtionality.
 */
class Main {
    public static void main(String[] args) {
        CountryName listNames = new CountryName();
        listNames.saveCountryNames("India");
        listNames.saveCountryNames("Australia");
        listNames.saveCountryNames("Sri Lanka");
        listNames.saveCountryNames("South Africa");
        listNames.saveCountryNames("West Indies");
        listNames.saveCountryNames("India");

        System.out.println(listNames.saveCountryNames("England"));
        System.out.println(listNames.getCountry("Australia"));
        System.out.println(listNames.getCountry("Zimbambe"));
        System.out.println(listNames.getCountry("India"));
    }
}
