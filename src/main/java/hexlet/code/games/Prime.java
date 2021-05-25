package hexlet.code.games;

public final class Prime implements IGame {

    @Override
    public String getAnswer() {
        int number = IGame.generateRandomPositiveInteger();
        showQuestion(number);

        String correctAnswer = isPrime(number) ? YES : NO;

        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        IGame.printMessage("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private void showQuestion(final int number) {
        IGame.printMessage(String.format("Question: %d\n", number));
    }
}
