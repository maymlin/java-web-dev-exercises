package org.launchcode.java.studios.quizzes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Quiz {
    final Scanner input = new Scanner(System.in);
    private int score;
    private ArrayList<Question> questionsArrayList = new ArrayList<>();
    private int questionBankSize;
    private ArrayList<Integer> questionBankSizeArrayList = new ArrayList<>();
    private ArrayList<String> actionChoices = new ArrayList<>(
            List.of("Start quiz", "Grade quiz", "Exit")
    );
    private int actionId = -1;

    public Quiz(ArrayList<Question> questions) {
        questionsArrayList = questions;
        setScore(0);
    }

    public Quiz() { setScore(0); }

    public void runQuiz() {
        setScore(0);
        //        https://kodejava.org/how-do-i-validate-input-when-using-scanner/
        do {
            printMenuChoices();
            while (!input.hasNextInt()) {
                String invalidActionChoice = input.next();
                System.out.println("'" + invalidActionChoice + "' is not a valid choice.\n");
                System.out.println("Enter a choice between 0 and " + (actionChoices.size() - 1));
            }
            actionId = input.nextInt();
        } while (actionId < 0 || actionId > actionChoices.size() - 1);

        if (actionId == 0) {
            while (getQuestionBankSize() > 0) {
                questionBankSizeArrayList = generateQuestionsBankSizeArrayList(getQuestionBankSize());
                int questionIndex = questionBankSizeArrayList.get(pickRandomNumber(questionBankSize));
                Question nextQuestion = questionsArrayList.get(questionIndex);
                System.out.println(nextQuestion.getClass());
                if (nextQuestion.getClass().equals("class org.launchcode.java.studios.quizzes.MultipleChoice")) {
                    System.out.println("MC");
                } else {
                    questionBankSizeArrayList.remove(questionIndex);
                }
                questionBankSize--;
            }
            System.out.println("Quiz bank is empty.");
        } else if (actionId == 1) {

        } else if (actionId == 2) {
            return ;
        }

    }

    private ArrayList<Integer> generateQuestionsBankSizeArrayList(int aQuestionBankSize) {
        for (int i = 0; i < aQuestionBankSize; ++i) {
            questionBankSizeArrayList.add(i);
        }
        return questionBankSizeArrayList;
    }

    private int pickRandomNumber(int maxNumber) {
        return (int) Math.random() * (maxNumber);
    }

    public void printMenuChoices() {
        System.out.println("*** Let's play a game ***");
        printActionChoices();
        System.out.print("\nEnter a choice: ");
    }

    public void addQuestion(Question aQuestion) {
        questionsArrayList.add(aQuestion);
        setQuestionBankSize();
    }

    public void removeQuestion(Question aQuestion) {
        questionsArrayList.remove(aQuestion);
        setQuestionBankSize();
    }

    public void addActionChoice(String aActionChoice) {
        actionChoices.add(aActionChoice);
    }

    public void removeActionChoice(int actionChoiceIndex) {
        actionChoices.remove(actionChoiceIndex);
    }

    public void setQuestionsArrayList(ArrayList<Question> aQuestionsArrayList) {
        questionsArrayList = aQuestionsArrayList;
        setQuestionBankSize();
    }

    private void setQuestionBankSize() {
        questionBankSize = questionsArrayList.size();
    }

    private void setScore(int aScore) {
        score = aScore;
    }

    public ArrayList<Question> getQuestionsArrayList() {
        return questionsArrayList;
    }

    public ArrayList<String> getActionChoices() {
        return actionChoices;
    }

    public int getScore() {
        return score;
    }

    public int getQuestionBankSize() {
        return questionBankSize;
    }

    public void printActionChoices() {
        for (int i = 0; i < actionChoices.size(); ++i) {
            System.out.println(i + " - " + actionChoices.get(i));
        }
    }
}
