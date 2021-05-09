package hexlet.code.view.games;

import hexlet.code.view.Cli;

public class ProgressionCli extends Cli {

    public static void printQuestion(int[] series, int elementToHide, int seriesLength) {
        System.out.print("Question: ");

        for (int i = 0; i < seriesLength; i++) {
            if (series[i] == elementToHide) {
                System.out.print(".. ");
            } else {
                System.out.printf("%d ", series[i]);
            }
        }
        System.out.println();
    }
}
