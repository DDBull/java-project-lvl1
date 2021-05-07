package hexlet.code.controller;

import hexlet.code.view.Cli;

public final class Greet implements IGame {

    public void playTheGame() {
        Cli.getPlayerName();
    }
}
