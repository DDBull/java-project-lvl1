package hexlet.code.games;

import java.util.Random;

public interface IGame {

    int MAX_RANDOM = 100;
    String YES = "yes";
    String NO = "no";

    String getAnswer();

    void showInstructions();

    static int generateRandomInteger() {
        Random rand = new Random();
        return 1 + rand.nextInt(MAX_RANDOM);
    }

    static int generateRandomPositiveInteger() {
        Random rand = new Random();
        return 1 + rand.nextInt(MAX_RANDOM);
    }

    static void printCorrect() {
        System.out.println("Correct!");
    }

    static void printError() {
        System.out.println("ERROR! Invalid input!");
        printFinish();
    }

    static void printWrong(final String playerName, final String correctAnswer, final String playerAnswer) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", playerAnswer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", playerName);
    }

    static void printFinish() {
        System.out.println("Quitting the game. Bye!");
    }

    static void printCongratulations(final String playerName) {
        System.out.printf("Congratulations, %s!\n", playerName);
    }

    static void printMessage(final String message) {
        System.out.println(message);
    }
}
