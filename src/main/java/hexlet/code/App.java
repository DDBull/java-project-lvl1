package hexlet.code;

import hexlet.code.controller.Calc;
import hexlet.code.controller.Even;
import hexlet.code.controller.Greet;
import hexlet.code.controller.IGame;
import hexlet.code.controller.Gcd;
import hexlet.code.controller.Progression;
import hexlet.code.controller.Prime;
import hexlet.code.view.Cli;

public class App {

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static void main(String[] args) {
        int gameNumber = Cli.chooseGame();
        IGame game;

        switch (gameNumber) {
            case GREET -> {
                game = new Greet();
                game.playTheGame();
            }
            case EVEN -> {
                game = new Even();
                game.playTheGame();
            }
            case CALC -> {
                game = new Calc();
                game.playTheGame();
            }
            case GCD -> {
                game = new Gcd();
                game.playTheGame();
            }
            case PROGRESSION -> {
                game = new Progression();
                game.playTheGame();
            }
            case PRIME -> {
                game = new Prime();
                game.playTheGame();
            }
            case EXIT -> Cli.finishTheApp();
            default -> Cli.printError();
        }
    }
}
