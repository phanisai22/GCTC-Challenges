package org.multithreading.namethreads;

public class Main {
    public static void main(String[] args) {
        Scooby scooby = new Scooby();
        Thread t1 = new Thread(scooby, "Scooby");
        t1.start();

        Shaggy shaggy = new Shaggy();
        Thread t2 = new Thread(shaggy, "Shaggy");
        t2.start();
    }
}
