package org.collection.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class TreeMapCountryCapital {

    private TreeMap<String, String> M1;

    public TreeMapCountryCapital() {
        M1 = new TreeMap<>();
    }

    public TreeMap<String, String> saveCountryCaptial(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.getOrDefault(countryName, "Country Not Found");
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (capital.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return "Capital Not Found";
    }

    public TreeMap<String, String> copyCollection() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getCountryList(){
        ArrayList<String> countryList = new ArrayList<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            countryList.add(entry.getKey());
        }
        return countryList;
    }

}
