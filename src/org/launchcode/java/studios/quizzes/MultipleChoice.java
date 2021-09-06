package org.launchcode.java.studios.quizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private int qid;
    private ArrayList<String> wrongAnswers = new ArrayList<>();

    public MultipleChoice(String questionType, String question, String answer) {
        super(questionType, question, answer);
        qid = super.getQuestionNumber();
    }

    public MultipleChoice() {
        qid = super.getQuestionNumber();
    }

    public void setWrongAnswers(String aWrongAnswer) {
        wrongAnswers.add(aWrongAnswer);
    }

    public int getQid() {
        return qid;
    }

    public ArrayList<String> getWrongAnswers() {
        return wrongAnswers;
    }

}
