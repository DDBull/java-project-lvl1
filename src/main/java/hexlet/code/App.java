package hexlet.code;

import hexlet.code.controller.Engine;
import hexlet.code.view.Cli;

public class App {

    public static void main(String[] args) {
        int gameNumber = Cli.chooseGame();

        Engine.startEngine(gameNumber);
    }
}
