package hexlet.code;

import hexlet.code.controller.Even;
import hexlet.code.controller.Greet;
import hexlet.code.controller.IGame;
import hexlet.code.view.Cli;

public class App {

    public static void main(String[] args) {
        int gameNumber = Cli.chooseGame();
        IGame game;

        switch (gameNumber) {
            case 1 -> { // Greet
                game = new Greet();
                game.playTheGame();
            }
            case 2 -> { // Even
                game = new Even();
                game.playTheGame();
            }
            case 0 -> // Exit
                    Cli.finishTheApp();
            default -> // Error
                    Cli.printError();
        }
    }
}
