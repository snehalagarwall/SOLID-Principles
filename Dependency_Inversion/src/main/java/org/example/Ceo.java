package org.example;

public class Ceo {
    private Manager manager;

    public Ceo(Manager manager) {
        this.manager = manager;
    }

    public void instruct() {
        System.out.println("CEO instructing manager...");
        manager.manageWork();
    }
}
