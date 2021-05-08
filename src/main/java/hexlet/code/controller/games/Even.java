package hexlet.code.controller.games;

import hexlet.code.view.games.EvenCli;

public final class Even implements IGame {

    @Override
    public boolean playTheGame(final String playerName) {

        int number = IGame.generateRandomInteger();
        EvenCli.printQuestion(number);

        String playerAnswer = EvenCli.getAnswer();
        String correctAnswer = number % 2 == 0 ? YES : NO;

        if (correctAnswer.equals(playerAnswer)) {
            EvenCli.printCorrect();
            return true;
        }

        EvenCli.printWrong(playerName, correctAnswer, playerAnswer);
        return false;
    }

    @Override
    public void showInstructions() {
        EvenCli.printStartingMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
