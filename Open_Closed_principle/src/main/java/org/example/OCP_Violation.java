package org.example;

public class OCP_Violation {
    public double calculateBonus(String playerType) {

        if (playerType.equals("Batsman")) {
            return 50000;
        }
        else if (playerType.equals("Bowler")) {
            return 40000;
        }
        else if (playerType.equals("AllRounder")) {
            return 70000;
        }

        return 0;
    }
}
