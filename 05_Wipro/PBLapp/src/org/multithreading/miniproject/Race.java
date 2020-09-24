package org.multithreading.miniproject;

public class Race implements Runnable {

    public static String winner;

    public void race() {

        for (int distance = 1; distance <= 100; distance++) {
            System.out.println(Thread.currentThread().getName() + " ran " + distance + " meters.");

            if (distance == 30 && Thread.currentThread().getName().equals("Hare")) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is sleeping. ZZZzzzzz");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            boolean isRaceWon = this.isRaceWon(distance);
            if (isRaceWon)
                break;
        }
    }

    private boolean isRaceWon(int n) {
        boolean won = false;
        if ((Race.winner == null) && (n == 100)) {
            String winnerName = Thread.currentThread().getName();
            Race.winner = winnerName;
            System.out.println("\nWINNER is: " + Race.winner);
            won = true;
        } else if (Race.winner != null) {
            won = true;
        }

        return won;
    }

    @Override
    public void run() {
        this.race();
    }
}
