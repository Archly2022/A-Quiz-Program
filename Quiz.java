package com.SuperPower;

    public class Quiz {
        public static void main(String[] args) {
            //We create MultipleChoiceQuestion objects using Question class
            // check method is called for each instance of our MultipleChoiceQuestion
            // check method will display our dialog box with questions and
            // take user input.
            Question question = new MultipleChoiceQuestion(
                    "Which ocean is the largest ocean in the world?",
                    "Pacific Ocean",
                    "Atlantic Ocean",
                    "Klobabay Ocean",
                    "Mid-west Ocean",
                    "Mid-east Ocean",
                    "b");
            question.check();

            question = new MultipleChoiceQuestion(
                    "What makes the Sky blue?",
                    "Rain",
                    "Science",
                    "Biology",
                    "Colour",
                    "None of the above",
                    "e");
            question.check();

            question = new MultipleChoiceQuestion(
                    "Which language is mostly based on object-oriented programming ?",
                    "Python",
                    "Java",
                    "C++",
                    "Javascript",
                    "PHP",
                    "b");
            question.check();

            question = new MultipleChoiceQuestion(
                    "What is the most widely used programming language in the Globe?",
                    "Python",
                    "Java",
                    "C++",
                    "Javascript",
                    "PHP",
                    "b");
            question.check();

            question = new MultipleChoiceQuestion(
                    "Which language is most likely used in machine learning?",
                    "Python",
                    "Java",
                    "C++",
                    "Javascript",
                    "PHP",
                    "a");
            question.check();

           question = new TrueFalseQuestion(
                    "The colour of the sky is blue?",
                    "False");
            question.check();

            question = new TrueFalseQuestion(
                    "The sun evolve around the earth?",
                    "False");
            question.check();


            question = new TrueFalseQuestion(
                    "The hottest planet in the solar system is Neptune?",
                    "False");
            question.check();

            question = new TrueFalseQuestion(
                    "Ghana founded cocoa in their land long before their independence?",
                    "False");
            question.check();

            question = new TrueFalseQuestion(
                    "Russia is one of the highest oil mining country in the world?",
                    "True");
            question.check();

            Question.showResults();
        }}