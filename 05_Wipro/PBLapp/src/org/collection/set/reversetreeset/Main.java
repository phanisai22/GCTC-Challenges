package org.collection.set.reversetreeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<ReverseTreeSet> listNames = new TreeSet<>();
        listNames.add(new ReverseTreeSet("India"));
        listNames.add(new ReverseTreeSet("Australia"));
        listNames.add(new ReverseTreeSet("Sri Lanka"));
        listNames.add(new ReverseTreeSet("Zimbambe"));
        listNames.add(new ReverseTreeSet("India"));

        Iterator<ReverseTreeSet> iter = listNames.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getName());
        }

    }
}
