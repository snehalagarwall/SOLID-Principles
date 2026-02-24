package org.example;

public class Main {
    public static void main(String[] args) {
        RohitSharma rohit = new RohitSharma();

        rohit.playCricket();

        PerformanceReport report = new PerformanceReport();
        report.generate(rohit);

        ContractManager manager = new ContractManager();
        manager.manage(rohit);
    }
}
