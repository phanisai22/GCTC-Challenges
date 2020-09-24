package org.multithreading.priority;

public class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + " thread is running: " + i);
        }
    }
}
