package hexlet.code.controller;

import hexlet.code.view.CliForEven;

public final class Even implements IGame {

    public void playTheGame() {

        String playerName = CliForEven.getPlayerName();
        CliForEven.printStartingMessage();

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int number = IGame.generateRandomInteger();
            CliForEven.printQuestion(number);

            String playerAnswer = CliForEven.getAnswer();

            if (number % 2 == 0 && "yes".equals(playerAnswer)) {
                CliForEven.printCorrect();
            } else if (number % 2 == 1 && "no".equals(playerAnswer)) {
                CliForEven.printCorrect();
            } else {
                String correctAnswer = number % 2 == 0 ? "yes" : "no";
                CliForEven.printError(playerName, correctAnswer, playerAnswer);
                return;
            }
        }

        CliForEven.printCongratulations(playerName);
    }
}
