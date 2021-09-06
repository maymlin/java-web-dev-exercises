package org.launchcode.java.studios.quizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();
        newQuiz.setQuestionsArrayList(createQuestions());



        newQuiz.runQuiz();
    }

    public static ArrayList<Question> createQuestions() {
        Question mc01 = new MultipleChoice();
        Question tf01 = new TrueFalse();
        Question cb01 = new Checkbox();

        ArrayList<Question> newQuestionsArrayList = new ArrayList<>(
                Arrays.asList(mc01, tf01, cb01)
        );

        return newQuestionsArrayList;
    }
}
