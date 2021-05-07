package hexlet.code.controller;

import hexlet.code.view.CliForEven;

import java.util.Random;

public class Even {

    static final int MAX_RANDOM = 1000;
    static final int NUMBER_OF_TRIES = 3;

    public static void playTheGame() {

        String playerName = CliForEven.getPlayerName();
        CliForEven.printStartingMessage();

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            int number = generateRandomInteger(); // 0..999
            CliForEven.printQuestion(number);

            String playerAnswer = CliForEven.getAnswer();

            if (number % 2 == 0 && "yes".equals(playerAnswer)) {
                CliForEven.printCorrect();
            } else if (number % 2 == 1 && "no".equals(playerAnswer)) {
                CliForEven.printCorrect();
            } else {
                String correctAnswer = number % 2 == 0 ? "yes" : "no";
                CliForEven.printError(playerName, correctAnswer, playerAnswer);
                return;
            }
        }

        CliForEven.printCongratulations(playerName);
    }

    private static int generateRandomInteger() {
        Random rand = new Random();
        return rand.nextInt(MAX_RANDOM);
    }
}
