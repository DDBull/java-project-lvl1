package hexlet.code;

import hexlet.code.controller.Even;
import hexlet.code.view.Cli;

public class App {

    public static void main(String[] args) {
        int gameNumber = Cli.chooseGame();
        String playerName;

        switch (gameNumber) {
            case 1: // Greet
                playerName = Cli.getPlayerName();
                break;
            case 2: // Even
                Even.playTheGame();
                break;
            case 0: // Exit
                Cli.finishTheApp();
                break;
            default: // Error
                Cli.printError();
                break;
        }
    }
}
