package hexlet.code.games;

import hexlet.code.Cli;

public final class Calc implements IGame {

    @Override
    public String getAnswer() {
        int firstNumber = IGame.generateRandomInteger();
        int secondNumber = IGame.generateRandomInteger();

        char[] availableOperators = {'+', '-', '*'};
        char operator = availableOperators[IGame.generateRandomInteger() % availableOperators.length];

        showQuestion(firstNumber, secondNumber, operator);

        int correctAnswer = calculateAnswer(firstNumber, secondNumber, operator);

        return Integer.toString(correctAnswer);
    }

    @Override
    public void showInstructions() {
        Cli.printMessage("What is the result of the expression?");
    }

    private void showQuestion(int firstNumber, int secondNumber, char operator) {
        Cli.printMessage(String.format("Question: %d %c %d\n", firstNumber, operator, secondNumber));
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
