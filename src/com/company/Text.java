package com.company;

public class Text {
    private Sentence[] sentences;



    public Text(String textString){
        String [] split = textString.split("(?<=[?!.]) ");
        sentences = new Sentence[split.length];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i]= new Sentence(split[i]);
        }

    }
    public Sentence[] getSentences() {
        return sentences;
    }

}
