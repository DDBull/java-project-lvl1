package hexlet.code.controller.games;

import hexlet.code.view.Cli;

public final class Greet implements IGame {

    @Override
    public boolean playTheGame(final String playerName) {
        Cli.getPlayerName();
        return true;
    }

    @Override
    public void showInstructions() { }
}
