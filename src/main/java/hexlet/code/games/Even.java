package hexlet.code.games;

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
        IGame.printMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private boolean isEven(final int number) {
        return number % 2 == 0;
    }

    private void showQuestion(final int number) {
        IGame.printMessage(String.format("Question: %d\n", number));
    }
}
