package hexlet.code.controller.games;

import hexlet.code.view.games.GcdCli;

public final class Gcd implements IGame {

    @Override
    public String getAnswerShowQuestion() {
        int firstNumber = IGame.generateRandomPositiveInteger();
        int secondNumber = IGame.generateRandomPositiveInteger();

        GcdCli.printQuestion(firstNumber, secondNumber);
        int correctAnswer = findGCD(firstNumber, secondNumber);

        return Integer.toString(correctAnswer);
    }

    @Override
    public void showInstructions() {
        GcdCli.printStartingMessage("Find the greatest common divisor of given numbers.");
    }

    private int findGCD(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        if (firstNumber % secondNumber == 0) {
            return secondNumber;
        }

        return findGCD(firstNumber - secondNumber, secondNumber);
    }
}
