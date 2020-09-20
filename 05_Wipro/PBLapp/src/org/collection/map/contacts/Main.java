package org.collection.map.contacts;

public class Main {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        list.addContact("John snow", 123123123);
        list.addContact("danny", 999999999);
        list.addContact("danny", 000111222);
        list.addContact("John snow", 444000555);

        System.out.println(list.getContacts().toString());
    }

}
