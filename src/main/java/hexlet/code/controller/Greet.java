package hexlet.code.controller;

import hexlet.code.view.Cli;

public final class Greet implements IGame {

    @Override
    public void playTheGame() {
        Cli.getPlayerName();
    }
}
