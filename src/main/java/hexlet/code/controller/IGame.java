package hexlet.code.controller;

import java.util.Random;

public interface IGame {
    int MAX_RANDOM = 100;
    int NUMBER_OF_TRIES = 3;

    void playTheGame();

    static int generateRandomInteger() {
        Random rand = new Random();
        return 1 + rand.nextInt(MAX_RANDOM);
    }

    static int generateRandomPositiveInteger() {
        Random rand = new Random();
        return 1 + rand.nextInt(MAX_RANDOM);
    }
}
