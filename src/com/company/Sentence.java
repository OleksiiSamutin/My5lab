package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Sentence {
    private Object[] sentenceElements;


    public Sentence(String sentenceString) {

        Pattern p = Pattern.compile("[\\p{L}\\p{M}\\p{N}]+|[\\p{P}\\p{S}]");
        List<String> list = new ArrayList<String>();

        //Pattern p = Pattern.compile("[a-zA-Z]+|\\p{Punct}");
        Matcher m = p.matcher(sentenceString);
        while (m.find()) {
            list.add(m.group());
        }
        String[] split = list.toArray(new String[list.size()]);
        sentenceElements = new Object[split.length];


        for (int i = 0; i < sentenceElements.length; i++) {
            if (Punctuation.getPunctuationSymbols().contains(split[i])) {
                sentenceElements[i] = new Punctuation(split[i]);
            } else if (split[i].matches("-?\\d+(\\.\\d+)?")) {
                sentenceElements[i] = new Number(split[i]);
            } else {
                sentenceElements[i] = new Word(split[i]);
            }

        }

    }

    public Object[] getSentenceElements() {
        return sentenceElements;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Object value : sentenceElements) {
            builder.append(value + " ");
        }
        String text = builder.toString();


        return text;
    }

    public boolean isWordInSentence(String taskWord) {
        for (int i = 0; i < sentenceElements.length; i++) {
            if (sentenceElements[i].toString().equals(taskWord))
                return true;

        }
        return false;
    }
}