package com.company;

import java.util.Scanner;

public class AnswerChecker {
    private QuestionShort questionShort;
    private Scanner scan = new Scanner(System.in);
    private String input;

    public AnswerChecker(QuestionShort questionShort){
        this.questionShort = questionShort;
    }
    public void askQuestion(){
        System.out.println(questionShort.getQuestionBody());
        input = scan.nextLine();
    }
    public boolean result(){
    return input.equals(questionShort.getCorrectAnswer());
    }
}