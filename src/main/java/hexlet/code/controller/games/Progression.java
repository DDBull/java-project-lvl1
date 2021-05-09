package hexlet.code.controller.games;

import hexlet.code.view.games.ProgressionCli;

public final class Progression implements IGame {

    private static final int SERIES_LENGTH = 10;

    @Override
    public String getAnswerShowQuestion() {
        int[] series = new int[SERIES_LENGTH];

        series[0] = IGame.generateRandomInteger();
        int step = IGame.generateRandomInteger() - IGame.generateRandomInteger();

        for (int i = 1; i < SERIES_LENGTH; i++) {
            series[i] = series[i - 1] + step;
        }

        int elementToHide = series[IGame.generateRandomInteger() % SERIES_LENGTH];
        ProgressionCli.printQuestion(series, elementToHide, SERIES_LENGTH);

        return Integer.toString(elementToHide);
    }

    @Override
    public void showInstructions() {
        ProgressionCli.printStartingMessage("What number is missing in the progression?");
    }
}
