package com.SuperPower;
import javax.swing.*;
public class TrueFalseQuestion extends Question{

    public TrueFalseQuestion(String question, String answer) {
        super(question);
        JPanel buttons = new JPanel();
        addButton(buttons,"True");
        addButton(buttons,"False");
        //we pass the buttons to our question dialog
        this.question.add(buttons);
        initQuestionDialogue();
        this.correctAnswer = answer;
    }
    public void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        buttons.add(button);
        button.addActionListener(question);
    }
    }


