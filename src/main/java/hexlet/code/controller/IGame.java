package hexlet.code.controller;

import java.util.Random;

public interface IGame {
    int MAX_RANDOM = 1000;
    int NUMBER_OF_TRIES = 3;

    void playTheGame();

    static int generateRandomInteger() {
        Random rand = new Random();
        return rand.nextInt(MAX_RANDOM);
    }
}
