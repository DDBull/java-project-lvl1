package hexlet.code.controller.games;

import hexlet.code.view.games.CalcCli;

public final class Calc implements IGame {

    @Override
    public boolean playTheGame(final String playerName) {

        int firstNumber = IGame.generateRandomInteger();
        int secondNumber = IGame.generateRandomInteger();

        char[] availableOperators = {'+', '-', '*'};
        char operator = availableOperators[IGame.generateRandomInteger() % availableOperators.length];

        CalcCli.printQuestion(firstNumber, secondNumber, operator);

        int playerAnswer = Integer.parseInt(CalcCli.getAnswer()); // CalcCli.getAnswer() returns String
        int correctAnswer = calculateAnswer(firstNumber, secondNumber, operator);

        if (playerAnswer == correctAnswer) {
            CalcCli.printCorrect();
            return true;
        }

        CalcCli.printWrong(playerName, correctAnswer, playerAnswer);
        return false;
    }

    @Override
    public void showInstructions() {
        CalcCli.printStartingMessage("What is the result of the expression?");
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
