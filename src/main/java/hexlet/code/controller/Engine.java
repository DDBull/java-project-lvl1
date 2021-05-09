package hexlet.code.controller;

import hexlet.code.controller.games.IGame;
import hexlet.code.controller.games.Calc;
import hexlet.code.controller.games.Even;
import hexlet.code.controller.games.Gcd;
import hexlet.code.controller.games.Progression;
import hexlet.code.controller.games.Prime;
import hexlet.code.view.Cli;

public class Engine {

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static final int NUMBER_OF_TRIES = 3;

    public static void startEngine(final int gameNumber) {

        switch (gameNumber) {
            case GREET -> Cli.getPlayerName();
            case EVEN -> Engine.runEngine(new Even());
            case CALC -> Engine.runEngine(new Calc());
            case GCD -> Engine.runEngine(new Gcd());
            case PROGRESSION -> Engine.runEngine(new Progression());
            case PRIME -> Engine.runEngine(new Prime());
            case EXIT -> Cli.finishTheApp();
            default -> Cli.printError();
        }
    }

    private static void runEngine(final IGame game) {
        final String playerName = Cli.getPlayerName();
        game.showInstructions();

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            String correctAnswer = game.getAnswerShowQuestion();
            String playerAnswer = Cli.getAnswer();

            if (!correctAnswer.equals(playerAnswer)) {
                Cli.printWrong(playerName, correctAnswer, playerAnswer);
                return;
            }

            Cli.printCorrect();
        }

        Cli.printCongratulations(playerName);
    }
}
