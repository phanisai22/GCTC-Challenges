package org.collection.map.hashtable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class HashTableCountryCapital {

    private Hashtable<String, String> M1;

    public HashTableCountryCapital() {
        M1 = new Hashtable<>();
    }

    public Hashtable<String, String> saveCountryCaptial(String countryName, String capital) {
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

    public Hashtable<String, String> copyCollection() {
        Hashtable<String, String> M2 = new Hashtable<>();
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
