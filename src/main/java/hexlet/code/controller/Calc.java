package hexlet.code.controller;

import hexlet.code.view.CalcCli;

public final class Calc implements IGame {

    public void playTheGame() {

        String playerName = CalcCli.getPlayerName();
        CalcCli.printStartingMessage("What is the result of the expression?");

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int firstNumber = IGame.generateRandomInteger();
            int secondNumber = IGame.generateRandomInteger();

            char[] availableOperators = {'+', '-', '*'};
            char operator = availableOperators[IGame.generateRandomInteger() % availableOperators.length];

            CalcCli.printQuestion(firstNumber, secondNumber, operator);

            int playerAnswer = Integer.parseInt(CalcCli.getAnswer());
            int correctAnswer = calculateAnswer(firstNumber, secondNumber, operator);

            if (playerAnswer == correctAnswer) {
                CalcCli.printCorrect();
            } else {
                CalcCli.printError(playerName, correctAnswer, playerAnswer);
                return;
            }
        }

        CalcCli.printCongratulations(playerName);
    }

    private int calculateAnswer(int firstNumber, int secondNumber, char operator) {

        switch (operator) {
            case '+' -> {
                return firstNumber + secondNumber;
            }
            case '-' -> {
                return firstNumber - secondNumber;
            }
            default -> { // multiplication
                return firstNumber * secondNumber;
            }
        }
    }
}
