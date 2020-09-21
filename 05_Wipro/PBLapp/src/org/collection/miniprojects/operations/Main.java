package org.collection.miniprojects.operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringList list = new StringList();
        int choice = 0;
        do {
            printOptions();
            System.out.println("Enter your Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Item to be inserted: ");
                    System.out.println(list.insertString(sc.next()));
                    break;
                case 2:
                    System.out.println("Enter the item to search: ");
                    System.out.println(list.searchString(sc.next()));
                    break;
                case 3:
                    System.out.println("Enter the item to delete: ");
                    System.out.println(list.deleteString(sc.next()));
                    break;
                case 4:
                    list.printItems(list);
                    break;
                case 5:
                    System.out.println("Exiting... ");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void printOptions() {
        System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit\n");
    }
}
