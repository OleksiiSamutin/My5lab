package com.company;

public class Punctuation extends Object{
    private static final String PUNCTUATION_SYMBOLS = ",.!?();:\"\'_-";
    private String symbols;

    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    public static String getPunctuationSymbols() {
        return PUNCTUATION_SYMBOLS;
    }

    @Override
    public String toString() {
        return symbols;
    }

    public String getSymbols() {
        return symbols;
    }
}
