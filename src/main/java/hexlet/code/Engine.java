package hexlet.code;

import hexlet.code.games.IGame;

public class Engine {

    private static final int NUMBER_OF_TRIES = 3;

    public static void play(final IGame game) {
        final String playerName = Cli.getPlayerName();
        game.showInstructions();

        int i = 0;
        String correctAnswer;
        String playerAnswer;
        boolean allAnswersTrue = true;

        do {
            ++i;

            correctAnswer = game.getAnswer();
            playerAnswer = Cli.getAnswer();

            if (correctAnswer.equals(playerAnswer)) {
                IGame.printCorrect();
            } else {
                IGame.printWrong(playerName, correctAnswer, playerAnswer);
                allAnswersTrue = false;
            }
        } while (i < NUMBER_OF_TRIES && correctAnswer.equals(playerAnswer));

        if (allAnswersTrue) {
            IGame.printCongratulations(playerName);
        }
    }
}
