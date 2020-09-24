package org.multithreading.zerototen;

public class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i == 6) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(i);
        }
    }
}
