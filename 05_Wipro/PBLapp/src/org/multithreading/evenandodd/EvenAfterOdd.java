package org.multithreading.evenandodd;

public class EvenAfterOdd{

    private final int MAX = 20;
    private int even;
    private int odd;


    public EvenAfterOdd(){
        this.even = 2;
        this.odd = 1;
    }

    public void printEvenNumber(){
        while(this.even <= MAX){
            System.out.println(this.even);
            even += 2;
        }
    }

    public void printOddNumber(){
        while(this.odd <= MAX){
            System.out.println(this.odd);
            odd += 2;
        }
    }
}
