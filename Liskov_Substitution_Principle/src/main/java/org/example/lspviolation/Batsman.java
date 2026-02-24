package org.example.lspviolation;

public class Batsman extends Cricketer{
    @Override
    public void bowl() {
        throw new UnsupportedOperationException("Batsman cannot bowl");
    }
}
