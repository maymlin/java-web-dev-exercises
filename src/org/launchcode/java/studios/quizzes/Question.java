package org.launchcode.java.studios.quizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    static int questionNumber = -1;
    protected String questionType;
    protected String question;
    protected ArrayList<String> answersArrayList = new ArrayList<>();
    protected  ArrayList<String> questionTypesArrayList = new ArrayList<>(
            Arrays.asList("Multiple Choice", "Checkbox", "True/False")
    );

    public Question(String questionType, String question, String answer) {
        setQuestionNumber();
        this.question = question;
        this.answersArrayList.add(answer);
        if (isValidQuestionType(questionType)) {
            setQuestionType(questionType);
            System.out.println("Question created successfully.");
        } else {
            System.out.println("Question type is invalid. Please reset ASAP.");
        }
    }

    public Question() { }

    protected void setQuestionNumber() {
        questionNumber += 1;
    }

    protected void setQuestionType(String aQuestionType) {
        questionType = aQuestionType;
    }

    protected void setQuestion(String aQuestion) {
        question = aQuestion;
    }

    protected void setAnswer(String aAnswer) {
        answersArrayList.add(aAnswer);
    }

    protected int getQuestionNumber() {
        return questionNumber;
    }

    protected String getQuestionType() {
        return questionType;
    }

    protected String getQuestion() {
        return question;
    }

    protected ArrayList<String> getAnswer() {
        return answersArrayList;
    }

    protected boolean isValidQuestionType(String aQuestionType) {
        return questionTypesArrayList.contains(aQuestionType);
    }
}
