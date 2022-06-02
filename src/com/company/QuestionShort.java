package com.company;

public class QuestionShort {
    private String questionBody;
    private String correctAnswer;

    public QuestionShort(String questionBody, String correctAnswer){
        this.questionBody = questionBody;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionBody() {return questionBody;}
    public String getCorrectAnswer() {return correctAnswer;}
}
