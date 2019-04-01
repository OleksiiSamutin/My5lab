package com.company;

public class Word extends Object{
    private Letter[] letters;
    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i]= new Letter(word.charAt(i));

        }

    }
    @Override
    public String toString() {
        String result = "";
        for (Letter letter : letters) {
            result += letter.toString();
        }
        return result;
    }

    public Letter[] getLetters() {
        return letters;
    }
}
