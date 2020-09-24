package org.multithreading.evenandodd;

public class Main {
    public static void main(String[] args) {
        EvenAfterOdd eo = new EvenAfterOdd();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                eo.printEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                eo.printOddNumber();
            }
        });

        t1.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
