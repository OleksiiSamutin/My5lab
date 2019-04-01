package com.company;

public class Number extends Object {
    private Figure[] aNumbers;

    public Number(String number) {
        aNumbers = new Figure[number.length()];
        for (int i = 0; i < number.length(); i++) {
            aNumbers[i]= new Figure(Character.getNumericValue(number.charAt(i)));
        }

    }
    public String toString() {
        String result = "";
        for (Figure figure : aNumbers) {
            result += figure.toString();
        }
        return result;
    }
}
