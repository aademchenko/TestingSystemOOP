package com.company;

import java.util.Scanner;

public class GeneralResult {
    public static void main(String[] args) {
        QuestionList questionList = new QuestionList();
        AnswerChecker checker1 = new AnswerChecker(questionList.getQuestion1());
        AnswerChecker checker2 = new AnswerChecker(questionList.getQuestion2());
        AnswerChecker checker3 = new AnswerChecker(questionList.getQuestion3());
        AnswerChecker[] checkers = {checker1, checker2, checker3};
        int correctAnswer = 0;
        int incorrectAnswer = 0;
        for (AnswerChecker checker : checkers) {
            checker.askQuestion();
            if (checker.result()){
                correctAnswer++;
                System.out.println("Ответ верный \n");
            }
            else{
                incorrectAnswer++;
                System.out.println("Ответ неверный \n");
            }
        }
        System.out.println ("Результат: правильно " + correctAnswer + ", неправильно " + incorrectAnswer);
    }
}
