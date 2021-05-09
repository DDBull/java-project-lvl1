package hexlet.code.controller.games;

import java.util.Random;

public interface IGame {

    int MAX_RANDOM = 100;
    String YES = "yes";
    String NO = "no";

    String getAnswerShowQuestion();

    void showInstructions();

    static int generateRandomInteger() {
        Random rand = new Random();
        return 1 + rand.nextInt(MAX_RANDOM);
    }

    static int generateRandomPositiveInteger() {
        Random rand = new Random();
        return 1 + rand.nextInt(MAX_RANDOM);
    }
}
