package org.multithreading.colours;

public class Main {

    public static void main(String[] args) {
        ColoursRunner cr = new ColoursRunner();
        Thread t1 = new Thread(cr, "Thread one");
        Thread t2 = new Thread(cr, "Thread two");
        t1.start();
        t2.start();
    }
}
