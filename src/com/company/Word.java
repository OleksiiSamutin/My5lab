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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Word) {
            Word word = (Word) obj;
            if (letters.length == word.letters.length) {
                for (int i = 0; i < letters.length; i++) {
                    if (!letters[i].equals(word.letters[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }


    public Letter[] getLetters() {
        return letters;
    }
}
