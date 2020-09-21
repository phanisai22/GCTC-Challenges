package org.collection.miniprojects.operations;

import java.util.Iterator;
import java.util.LinkedList;

public class StringList {
    private LinkedList<String> stringList;

    public StringList(){
        stringList = new LinkedList<>();
    }

    public LinkedList<String> getStringList(){
        return stringList;
    }

    public String insertString(String item){
        stringList.add(item);
        return "Inserted Successfully";
    }

    public String searchString(String item){
        Iterator<String> iter = stringList.iterator();
        while(iter.hasNext()){
            if (item.equals(iter.next())){
                return "Item found in the list";
            }
        }
        return "Item not found in the list";
    }

    public String deleteString(String item){
        if (stringList.remove(item)){
            return "Deleted Successfully";
        }
        return "Item Does not Exist";
    }

    public void printItems(StringList list){
        Iterator<String> iter = list.getStringList().iterator();
        System.out.println("Items in the list are:");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
