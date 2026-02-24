package org.example;

public class RohitSharma extends Cricketer implements Batsman {

    @Override
    public void play() {
        System.out.println("Rohit is playing cricket.");
    }

    @Override
    public void bat() {
        System.out.println("Rohit is batting.");
    }
}
