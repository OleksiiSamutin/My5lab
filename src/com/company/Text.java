package com.company;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;


    public Text(String textString) {
        String[] split = textString.split("(?<=[?!.]) ");
        sentences = new Sentence[split.length];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }

    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public String task(String[] taskWords) {
        //new String[]{"Hello", "from","the","outside"};
        String[] result = new String[taskWords.length];
        int counter = 0;
        for (int i = 0; i < taskWords.length; i++) {
            for (int j = 0; j < sentences.length; j++) {
                if (sentences[j].isWordInSentence(taskWords[i])) {
                    counter++;
                }
            }
            result[i]=("In the text " + "'" +taskWords[i] + "'" + " repeat: " + counter+"\n");

            counter = 0;

        }
        return Arrays.toString(result);
    }

}
