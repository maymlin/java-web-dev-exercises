package org.launchcode.java.studios.quizzes;

public class TrueFalse extends Question {
    private int qid;

    public TrueFalse(String questionType, String question, String answer) {
        super(questionType, question, answer);
        qid = getQuestionNumber();
    }

    public TrueFalse() {
        qid = getQuestionNumber();
    }

    public int getQid() {
        return qid;
    }

    @Override
    protected boolean isValidQuestionType(String aQuestionType) {
        return aQuestionType.equals("True/False");
    }
}
