package org.collection.list.restrictdatatype;

import java.util.ArrayList;
import java.util.List;

/**
 * Testing Numbers.java class with possible testcases.
 * 
 * @author Phani Sai
 * @see ArrayList
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        List<Numbers> list = new ArrayList<>();
        list.add(new Numbers(23));
        // list.add(new Numbers("None"));
        list.add(new Numbers(23.22));
        list.add(new Numbers(45.506f));
        list.add(new Numbers(2.0/45));
        list.add(new Numbers(22/23));

    }
}
