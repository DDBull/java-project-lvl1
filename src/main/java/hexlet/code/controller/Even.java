package hexlet.code.controller;

import hexlet.code.view.EvenCli;

public final class Even implements IGame {

    public void playTheGame() {

        String playerName = EvenCli.getPlayerName();
        EvenCli.printStartingMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int number = IGame.generateRandomInteger();
            EvenCli.printQuestion(number);

            String playerAnswer = EvenCli.getAnswer();

            if (number % 2 == 0 && "yes".equals(playerAnswer)) {
                EvenCli.printCorrect();
            }
            if (number % 2 == 1 && "no".equals(playerAnswer)) {
                EvenCli.printCorrect();
            } else {
                String correctAnswer = number % 2 == 0 ? "yes" : "no";
                EvenCli.printError(playerName, correctAnswer, playerAnswer);
                return;
            }
        }

        EvenCli.printCongratulations(playerName);
    }
}
