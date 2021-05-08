package hexlet.code.view;

public class PrimeCli extends Cli {

    public static void printQuestion(int number) {
        System.out.printf("Question: %d\n", number);
    }

    public static void printWrong(final String playerName, final String correctAnswer, final String playerAnswer) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", playerAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", playerName);
    }
}
