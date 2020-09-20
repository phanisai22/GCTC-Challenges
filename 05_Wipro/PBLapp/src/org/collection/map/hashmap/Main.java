package org.collection.map.hashmap;

public class Main {

    public static void main(String[] args) {
        HashMapCountryCapital testMap = new HashMapCountryCapital();

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
