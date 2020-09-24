package org.multithreading.namethreads;

public class Scooby implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running...");
    }

}
