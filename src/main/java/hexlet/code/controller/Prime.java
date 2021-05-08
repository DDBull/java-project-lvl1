package hexlet.code.controller;

import hexlet.code.view.PrimeCli;

public final class Prime implements IGame {

    @Override
    public void playTheGame() {
        String playerName = PrimeCli.getPlayerName();
        PrimeCli.printStartingMessage("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int number = IGame.generateRandomPositiveInteger();
            PrimeCli.printQuestion(number);

            String playerAnswer = PrimeCli.getAnswer();
            String correctAnswer = isPrime(number) ? "yes" : "no";

            if (correctAnswer.equals(playerAnswer)) {
                PrimeCli.printCorrect();
                continue;
            }

            PrimeCli.printWrong(playerName, correctAnswer, playerAnswer);
            return;
        }

        PrimeCli.printCongratulations(playerName);
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
