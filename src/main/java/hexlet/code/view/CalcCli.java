package hexlet.code.view;

public class CalcCli extends Cli {

    public static void printQuestion(int firstNumber, int secondNumber, char operator) {
        System.out.printf("Question: %d %c %d\n", firstNumber, operator, secondNumber);
    }

    public static void printError(String playerName, int correctAnswer, int playerAnswer) {
        System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.\n", playerAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", playerName);
    }
}
