package com.company;

public class Letter {
    private char aChar;

    public Letter(char aChar) {
        this.aChar = aChar;
    }
    @Override
    public String toString() {
        return "" + aChar;
    }

    public char getaChar() {
        return aChar;
    }

}
