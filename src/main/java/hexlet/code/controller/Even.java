package hexlet.code.controller;

import hexlet.code.view.EvenCli;

public final class Even implements IGame {

    @Override
    public void playTheGame() {

        String playerName = EvenCli.getPlayerName();
        EvenCli.printStartingMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int number = IGame.generateRandomInteger();
            EvenCli.printQuestion(number);

            String playerAnswer = EvenCli.getAnswer();

            if (!validateAnswer(playerName, playerAnswer, number)) {
                return;
            }
        }

        EvenCli.printCongratulations(playerName);
    }

    private boolean validateAnswer(final String playerName, final String playerAnswer, final int number) {
        String correctAnswer = number % 2 == 0 ? "yes" : "no";

        if (correctAnswer.equals(playerAnswer)) {
            EvenCli.printCorrect();
            return true;
        }

        EvenCli.printWrong(playerName, correctAnswer, playerAnswer);

        return false;
    }
}
