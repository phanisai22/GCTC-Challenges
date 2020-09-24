package org.multithreading.priority;

public class Main {

    public static void main(String[] args) {
        Runner r = new Runner();
        Thread t1 = new Thread(r, "MAX");
        Thread t2 = new Thread(r, "MIN");
        Thread t3 = new Thread(r, "NORM");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
