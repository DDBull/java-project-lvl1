package hexlet.code.view;

public class CliForEven extends Cli {

    public static void printError(final String playerName, final String correctAnswer, final String playerAnswer) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", playerAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", playerName);
    }

    public static void printStartingMessage() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void printQuestion(int number) {
        System.out.printf("Question: %d\n", number);
    }
}
