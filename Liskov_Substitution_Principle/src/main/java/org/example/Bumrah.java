package org.example;

public class Bumrah extends Cricketer implements Bowler {

    @Override
    public void play() {
        System.out.println("Bumrah is playing cricket.");
    }

    @Override
    public void bowl() {
        System.out.println("Bumrah is bowling.");
    }
}
