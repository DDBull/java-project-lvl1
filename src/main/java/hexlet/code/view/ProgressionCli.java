package hexlet.code.view;

public class ProgressionCli extends Cli {

    public static void printWrong(String playerName, int correctAnswer, int playerAnswer) {
        System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.\n", playerAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", playerName);
    }

    public static void printQuestion(int[] series, int elementToHide, int seriesLength) {
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
