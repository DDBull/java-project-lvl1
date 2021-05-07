package hexlet.code;

import hexlet.code.controller.Even;
import hexlet.code.controller.Greet;
import hexlet.code.view.Cli;

public class App {

    public static void main(String[] args) {
        int gameNumber = Cli.chooseGame();

        switch (gameNumber) {
            case 1 -> // Greet
                    Greet.playTheGame();
            case 2 -> // Even
                    Even.playTheGame();
            case 0 -> // Exit
                    Cli.finishTheApp();
            default -> // Error
                    Cli.printError();
        }
    }
}
