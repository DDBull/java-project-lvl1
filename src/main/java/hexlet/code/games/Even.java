package hexlet.code.games;

import hexlet.code.Cli;

public final class Even implements IGame {

    @Override
    public String getAnswer() {
        int number = IGame.generateRandomInteger();
        showQuestion(number);

        String correctAnswer = isEven(number) ? YES : NO;
        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        Cli.printStartingMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private boolean isEven(final int number) {
        return number % 2 == 0;
    }

    private void showQuestion(final int number) {
        Cli.printQuestion(String.format("Question: %d\n", number));
    }
}
