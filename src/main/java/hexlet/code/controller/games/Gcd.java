package hexlet.code.controller.games;

import hexlet.code.view.games.GcdCli;

public final class Gcd implements IGame {

    @Override
    public boolean playTheGame(final String playerName) {

        int firstNumber = IGame.generateRandomPositiveInteger();
        int secondNumber = IGame.generateRandomPositiveInteger();

        GcdCli.printQuestion(firstNumber, secondNumber);
        int playerAnswer = Integer.parseInt(GcdCli.getAnswer());
        int correctAnswer = findGCD(firstNumber, secondNumber);

        if (playerAnswer == correctAnswer) {
            GcdCli.printCorrect();
            return true;
        }

        GcdCli.printWrong(playerName, correctAnswer, playerAnswer);
        return false;
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
