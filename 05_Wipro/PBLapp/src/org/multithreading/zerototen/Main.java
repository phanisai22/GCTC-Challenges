package org.multithreading.zerototen;

public class Main {

    public static void main(String[] args) {
        Runner r = new Runner();
        Thread t = new Thread(r);
        t.start();
    }
}
