package hexlet.code.controller;

import hexlet.code.view.GcdCli;
import hexlet.code.view.ProgressionCli;

public final class Progression implements IGame {

    private static final int SERIES_LENGTH = 10;

    @Override
    public void playTheGame() {
        String playerName = ProgressionCli.getPlayerName();
        ProgressionCli.printStartingMessage("What number is missing in the progression?");

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int correctAnswer = generateQuestion();
            int playerAnswer = Integer.parseInt(ProgressionCli.getAnswer());

            if (playerAnswer == correctAnswer) {
                ProgressionCli.printCorrect();
            } else {
                ProgressionCli.printWrong(playerName, correctAnswer, playerAnswer);
                return;
            }
        }

        GcdCli.printCongratulations(playerName);
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
