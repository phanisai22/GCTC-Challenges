package com.abstraction.railcoach;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int gen = rand.nextInt(4);

            switch (gen) {
                case 0:
                    compartments[i] = new FirstClass();
                    System.out.println(compartments[i].notice());
                    break;
                case 1:
                    compartments[i] = new Ladies();
                    System.out.println(compartments[i].notice());
                    break;
                case 2:
                    compartments[i] = new General();
                    System.out.println(compartments[i].notice());
                    break;
                case 3:
                    compartments[i] = new Luggage();
                    System.out.println(compartments[i].notice());
                    break;
            }

        }
    }
}
