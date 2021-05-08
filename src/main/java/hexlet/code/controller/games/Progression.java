package hexlet.code.controller.games;

import hexlet.code.view.games.ProgressionCli;

public final class Progression implements IGame {

    private static final int SERIES_LENGTH = 10;

    @Override
    public boolean playTheGame(final String playerName) {

        int correctAnswer = generateQuestion();
        int playerAnswer = Integer.parseInt(ProgressionCli.getAnswer());

        if (playerAnswer == correctAnswer) {
            ProgressionCli.printCorrect();
            return true;
        }

        ProgressionCli.printWrong(playerName, correctAnswer, playerAnswer);
        return false;
    }

    @Override
    public void showInstructions() {
        ProgressionCli.printStartingMessage("What number is missing in the progression?");
    }

    private int generateQuestion() {
        int[] series = new int[SERIES_LENGTH];

        series[0] = IGame.generateRandomInteger();
        int step = IGame.generateRandomInteger() - IGame.generateRandomInteger();

        for (int i = 1; i < SERIES_LENGTH; i++) {
            series[i] = series[i - 1] + step;
        }

        int elementToHide = series[IGame.generateRandomInteger() % SERIES_LENGTH];
        ProgressionCli.printQuestion(series, elementToHide, SERIES_LENGTH);

        return elementToHide;
    }
}
