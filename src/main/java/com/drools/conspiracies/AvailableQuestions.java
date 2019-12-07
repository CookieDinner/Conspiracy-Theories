package com.drools.conspiracies;

import java.util.ArrayList;

public class AvailableQuestions {
    private ArrayList<String> available_questions = new ArrayList<>();

    public AvailableQuestions(){
        available_questions.add("Are the bastards out to get you?");
        available_questions.add("Who do you suppose THEY are?");
        available_questions.add("What, the government?");
    }

    public String getAvailableQuestion(int i) {
        return available_questions.get(i);
    }
}
