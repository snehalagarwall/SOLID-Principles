package org.example;

public class Main {
    public static void main(String[] args) {

        Player batsman = new Batsman();
        Player bowler = new Bowler();
        Player allRounder = new AllRounder();

        BonusCalculator calculator = new BonusCalculator();

        System.out.println(calculator.calculate(batsman));
        System.out.println(calculator.calculate(bowler));
        System.out.println(calculator.calculate(allRounder));
    }
}
