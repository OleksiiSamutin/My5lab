package com.company;

import java.util.Arrays;


public class Task {
    private String[] taskWords;
    private Text text;

    public Task(String[] taskWords, Text text) {
        this.taskWords = taskWords;
        this.text = text;

    }


    public String numberNine() {
        String[] result = new String[taskWords.length];
        boolean flag = false;
        int counter = 0;
        for (int k = 0; k < taskWords.length; k++) {
            for (int i = 0; i < text.getSentences().length; i++) {
                for (int j = 0; j < text.getSentences()[i].getSentenceElements().length; j++) {

                    if (text.getSentences()[i].getSentenceElements()[j] instanceof Word) {
                        if (text.getSentences()[i].getSentenceElements()[j].toString().equals(taskWords[k])) {
                            flag = true;

                        }
                    }
                }
                if (flag) {
                    counter += 1;
                    flag = false;
                }


            }
            result[k] = ("In the text " + "'" + taskWords[k] + "'" + " repeat: " + counter + "\n");

            counter = 0;
        }
        return Arrays.toString(result);
    }

}
