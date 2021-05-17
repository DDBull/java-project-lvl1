package hexlet.code;

import hexlet.code.games.IGame;

public class Game {

    private static final int NUMBER_OF_TRIES = 3;

    public static void play(final IGame game) {
        final String playerName = Cli.getPlayerName();
        game.showInstructions();

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            String correctAnswer = game.getAnswer();
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
