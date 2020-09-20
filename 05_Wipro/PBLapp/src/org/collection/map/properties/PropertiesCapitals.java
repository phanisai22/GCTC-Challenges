package org.collection.map.properties;

import java.util.Properties;

public class PropertiesCapitals {

    private Properties prop;

    public PropertiesCapitals(){
        prop = new Properties();
    }

    public Properties saveCapital(String state, String capital){
        prop.put(state, capital);
        return prop;
    }

    public Properties getProp(){
        return prop;
    }
}
