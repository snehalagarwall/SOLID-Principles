package org.example;

public class Manager {
    private Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    public void manageWork() {
        System.out.println("Manager assigning work...");
        employee.work();
    }
}
