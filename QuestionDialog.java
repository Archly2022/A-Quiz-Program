package com.SuperPower;
import java.awt.event.*;
import javax.swing.*;
//The QuestionDialog inherits our JDialog class
// which makes our QuestionDialog a Dialog-box//
// The class also implements the ActionListener object
// that lets us listen to actions like keyboard our mouse
// in this case we listen to button clicks-
public class QuestionDialog extends JDialog implements ActionListener {
    String answer;
//create a click event for the buttons
// the getActionCommand method gets the action taken to the button
// we get the value of that button and pass it to String variable answer

public void actionPerformed(ActionEvent e) {
    answer = e.getActionCommand();
    dispose();
}}