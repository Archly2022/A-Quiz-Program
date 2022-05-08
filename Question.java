package com.SuperPower;

import java.awt.*;
import javax.swing.*;
public abstract class Question {
    String correctAnswer;
    static int nCorrectAnswer = 0;
    static int nQuestion = 0;
     QuestionDialog question;

    //this creates an instance of the QuestionDialog class
// QuestionDialog question;    String correctAnswer;
// Our constructor creates a dialog box with questions
// We instantiate the question object
// we also set the layout of our QuestionDialog

    public Question(String question) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0, 1));
        this.question.add(new JLabel(" " +question+ " ", JLabel.CENTER));
    }

    //the ask method displays our dialog box
    // setting the question to visible displays our dialog box
    // we also return the value of answering our interface question

   public String ask(){
        question.setVisible(true);
        return question.answer;
   }

    //the initQuestionDialog sets the arrangements of our labels and buttons in our Panel.

    public void initQuestionDialogue() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }
//the check method calls on the ask method
// to display the dialog box with questions
// and also gets the answer
// and check if our answer is correct or not
public void check() {
    String answer = ask();
    nQuestion++;

    if (answer.equals(correctAnswer)) {
        JOptionPane.showMessageDialog(null, "Correct!");
        nCorrectAnswer++;
    } else {
        JOptionPane.showMessageDialog(null, "Incorrect");
    }

}
    public static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrectAnswer + " correct out of questions " + nQuestion);
}}