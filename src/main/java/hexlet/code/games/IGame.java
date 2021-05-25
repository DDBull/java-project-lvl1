package hexlet.code.games;

import hexlet.code.Cli;

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
        Cli.printMessage("Correct!");
    }

    static void printError() {
        Cli.printMessage("ERROR! Invalid input!");
        printFinish();
    }

    static void printWrong(final String playerName, final String correctAnswer, final String playerAnswer) {
        Cli.printMessage(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!",
                playerAnswer, correctAnswer, playerName));
    }

    static void printFinish() {
        Cli.printMessage("Quitting the game. Bye!");
    }

    static void printCongratulations(final String playerName) {
        Cli.printMessage(String.format("Congratulations, %s!\n", playerName));
    }
}
