package com.drools.conspiracies;

public class Answer {
    private Question question;
    private String answer;

    public Answer (Question question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
