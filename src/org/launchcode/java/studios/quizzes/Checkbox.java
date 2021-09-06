package org.launchcode.java.studios.quizzes;

import java.util.ArrayList;

public class Checkbox extends Question {
    private int qid;
    private ArrayList<String> wrongAnswers = new ArrayList<>();

    public Checkbox(String questionType, String question, String answer) {
        super(questionType, question, answer);
        qid = super.getQuestionNumber();
    }

    public Checkbox() {
        qid = super.getQuestionNumber();
    }

    public void setWrongAnswers(String aWrongAnswer) {
        wrongAnswers.add(aWrongAnswer);
    }

    public ArrayList<String> getWrongAnswers() {
        return wrongAnswers;
    }
}
