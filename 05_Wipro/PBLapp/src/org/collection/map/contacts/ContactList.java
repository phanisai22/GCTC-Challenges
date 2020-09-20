package org.collection.map.contacts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ContactList {

    private HashMap<String, Integer> contacts;

    public ContactList() {
        this.contacts = new HashMap<>();
    }

    public HashMap<String, Integer> getContacts(){
        return this.contacts;
    }

    public HashMap<String, Integer> addContact(String contactName, Integer contactNumber) {
        if (checkContactName(contactName)) {
            System.out.println("Contact name \"" + contactName + "\" already exists.");
        } else if (checkContactNumber(contactNumber)) {
            System.out.println("Contact number \"" + contactName + "\" already exists.");
        } else {
            this.contacts.put(contactName, contactNumber);
            return contacts;
        }
        return null;
    }

    private boolean checkContactName(String name) {
        Iterator<Entry<String, Integer>> iter = this.contacts.entrySet().iterator();

        while (iter.hasNext()) {
            Entry<String, Integer> entry = iter.next();
            if (name.equals(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkContactNumber(Integer number) {
        Iterator<Entry<String, Integer>> iter = this.contacts.entrySet().iterator();

        while (iter.hasNext()) {
            Entry<String, Integer> entry = iter.next();
            if (number.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }
}
