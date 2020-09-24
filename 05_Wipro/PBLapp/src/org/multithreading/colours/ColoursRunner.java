package org.multithreading.colours;

import java.util.Random;

public class ColoursRunner implements Runnable {
    private String colours[];

    public ColoursRunner() {
        colours = new String[] { "white", "blue", "black", "green", "red", "yellow" };
    }

    @Override
    public void run() {
        String colour = "null color";
        Random rand = new Random();
        int index;
        while (!colour.equals("red")) {
            index = rand.nextInt(6);
            colour = colours[index];
            System.out.println(Thread.currentThread().getName() + " " + colour);
        }

    }
}
