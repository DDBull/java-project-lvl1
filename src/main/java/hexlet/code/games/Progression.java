package hexlet.code.games;

import hexlet.code.Cli;

public final class Progression implements IGame {

    private static final int SERIES_LENGTH = 10;

    @Override
    public String getAnswer() {
        int[] series = new int[SERIES_LENGTH];

        series[0] = IGame.generateRandomInteger();
        int step = IGame.generateRandomInteger() - IGame.generateRandomInteger();

        for (int i = 1; i < SERIES_LENGTH; i++) {
            series[i] = series[i - 1] + step;
        }

        int elementToHide = series[IGame.generateRandomInteger() % SERIES_LENGTH];
        printQuestion(series, elementToHide);

        return Integer.toString(elementToHide);
    }

    @Override
    public void showInstructions() {
        Cli.printStartingMessage("What number is missing in the progression?");
    }

    private static void printQuestion(final int[] series, final int elementToHide) {
        System.out.print("Question: ");

        for (int i = 0; i < SERIES_LENGTH; i++) {
            if (series[i] == elementToHide) {
                System.out.print(".. ");
            } else {
                System.out.printf("%d ", series[i]);
            }
        }
        System.out.println();
    }
}
