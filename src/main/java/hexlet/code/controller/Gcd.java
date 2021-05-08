package hexlet.code.controller;

import hexlet.code.view.GcdCli;

public final class Gcd implements IGame {

    @Override
    public void playTheGame() {
        String playerName = GcdCli.getPlayerName();
        GcdCli.printStartingMessage("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int firstNumber = IGame.generateRandomPositiveInteger();
            int secondNumber = IGame.generateRandomPositiveInteger();

            GcdCli.printQuestion(firstNumber, secondNumber);
            int playerAnswer = Integer.parseInt(GcdCli.getAnswer());
            int correctAnswer = findGCD(firstNumber, secondNumber);

            if (playerAnswer == correctAnswer) {
                GcdCli.printCorrect();
            } else {
                GcdCli.printWrong(playerName, correctAnswer, playerAnswer);
                return;
            }
        }

        GcdCli.printCongratulations(playerName);
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
