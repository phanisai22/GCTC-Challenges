package org.collection.map.treemap;

public class Main {

    public static void main(String[] args) {
        TreeMapCountryCapital testMap = new TreeMapCountryCapital();

        testMap.saveCountryCaptial("India", "Delhi");
        testMap.saveCountryCaptial("Japan", "Tokyo");

        System.out.println(testMap.getCapital("India"));
        System.out.println(testMap.getCapital("Sri Lanka"));

        System.out.println(testMap.getCountry("Delhi"));
        System.out.println(testMap.getCountry("Hyderabad"));

        System.out.println(testMap.copyCollection());

        System.out.println(testMap.getCountryList());
    }
}
