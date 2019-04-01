package com.company;




public class Figure extends Object{
    private final static String DECIMAL_FIGURES = "012345679";
    private int anInt;

    public Figure(int anInt) {
        this.anInt = anInt;
    }

    public static String getDECIMAL_FIGURES() {
        return DECIMAL_FIGURES;
    }

    @Override
    public String toString() {
        return Integer.toString(anInt);
    }

    public int getAnInt() {
        return anInt;
    }
}
