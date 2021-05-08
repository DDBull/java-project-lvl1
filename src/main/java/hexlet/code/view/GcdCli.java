package hexlet.code.view;

public class GcdCli extends Cli {
    public static void printQuestion(int firstNumber, int secondNumber) {
        System.out.printf("Question: %d %d\n", firstNumber, secondNumber);
    }

    public static void printWrong(String playerName, int correctAnswer, int playerAnswer) {
        System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.\n", playerAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", playerName);
    }
}
