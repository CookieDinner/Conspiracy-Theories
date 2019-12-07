package com.drools.conspiracies;

import java.util.ArrayList;

public class AvailableAnswers {
    private ArrayList<String> available_answers = new ArrayList<>();

    public AvailableAnswers(){
        available_answers.add("Yes, they're up to something alright, I just know it.");
        available_answers.add("They say not.");
    }

    public String getAvailableAnswer(int i) {
        return available_answers.get(i);
    }
}
