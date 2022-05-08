package com.SuperPower;

import javax.swing.*;

public class RateQuestion extends Question{

    public RateQuestion(String question) {
        super(question);
        JPanel buttons = new JPanel();
        addButton(buttons,"Awful");
        addButton(buttons,"Not bad");
        addButton(buttons,"Satisfactory");
        this.question.add(buttons);
        initQuestionDialogue();
        this.correctAnswer = question;

    }
    public void addButton(JPanel buttons, String labels) {
        JButton button = new JButton(labels);
        buttons.add(button);
        button.addActionListener(question);
    }}





