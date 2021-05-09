package hexlet.code.controller.games;

import hexlet.code.view.games.EvenCli;

public final class Even implements IGame {

    @Override
    public String getAnswerShowQuestion() {
        int number = IGame.generateRandomInteger();
        EvenCli.printQuestion(number);

        String correctAnswer = number % 2 == 0 ? YES : NO;
        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        EvenCli.printStartingMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
