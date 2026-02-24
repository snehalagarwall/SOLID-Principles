package org.example.dipviolation;

public class Ceo {
    private Intern intern;

    public Ceo() {
        this.intern = new Intern();  // Direct dependency
    }

    public void assignWork() {
        intern.work();
    }
}
