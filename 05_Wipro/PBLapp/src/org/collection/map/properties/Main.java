package org.collection.map.properties;

import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        PropertiesCapitals propertiesCapitals = new PropertiesCapitals();
        propertiesCapitals.saveCapital("Telangana", "Hyderabad");
        propertiesCapitals.saveCapital("Andra Pradesh", "Amaravathi");

        Properties test = propertiesCapitals.getProp();

        Set<String> items = test.stringPropertyNames();
        for (String item : items) {
            System.out.println(item + " : "+ test.getProperty(item));
        }
        
    }

}
