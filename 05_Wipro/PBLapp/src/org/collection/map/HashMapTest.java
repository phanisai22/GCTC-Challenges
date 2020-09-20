package org.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

    private static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {

        map.put("phani", "books");
        map.put("pavan", "sweet");

        System.out.println(checkKey("pavan"));
        System.out.println(checkValue("books"));
        System.out.println(checkKey("PBL"));
        System.out.println(checkValue("LBP"));

    }

    public static boolean checkKey(String key) {
        Iterator<Entry<String, String>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Entry<String, String> entry = iter.next();
            if (key.equals(entry.getKey())) {
                return true;
            }
        }

        return false;
    }

    public static boolean checkValue(String value) {
        Iterator<Entry<String, String>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Entry<String, String> entry = iter.next();
            if (value.equals(entry.getValue())) {
                return true;
            }
        }

        return false;
    }

}
