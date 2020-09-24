package org.multithreading.miniproject;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        Thread TT = new Thread(race, "Tortoise");
        Thread HT = new Thread(race, "Hare");

        HT.setPriority(Thread.MAX_PRIORITY);

        TT.start();
        HT.start();
    }
}
