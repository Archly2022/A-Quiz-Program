package com.SuperPower;
import java.awt.*;
import  javax.swing.*;
public class MultipleChoiceQuestion extends Question {
    //this constructor adds all our questions and choices to our dialog box

//    public class MultiChoiceQuestion(String question)  {
//       super(question);
//}
   public MultipleChoiceQuestion(String question,String a, String b, String c, String d, String e, String answer){
       super(question);
       addChoice("A",a);
       addChoice("B",b);
       addChoice("C",c);
       addChoice("D",d);
       addChoice("E",e);
       this.correctAnswer = answer.toUpperCase();

   }




    //the addChoice method takes the name of the choice and its label
    // We add a panel so that we can append our buttons containing the choices
    // The panel choice is then added to our question QuestionDialog
    public void addChoice(String name, String label){
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(name);
        button.addActionListener(question);
        choice.add(button,BorderLayout.WEST);
        choice.add(new JLabel(label+" "),BorderLayout.CENTER);
        this.question.add(choice);
        initQuestionDialogue();
    }

    public String ask(){
      question.setVisible(true);
      return question.answer;
    }
}
