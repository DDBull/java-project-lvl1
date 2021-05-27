package hexlet.code.games;

public final class Prime implements IGame {

    private static final String INSTRUCTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private int number;
    private String correctAnswer;

    @Override
    public void initGame() {
        number = IGame.generateRandomPositiveInteger();
        correctAnswer = isPrime() ? YES : NO;
    }

    @Override
    public String getAnswer() {
        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        IGame.printMessage(INSTRUCTION);
    }

    private boolean isPrime() {
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

    @Override
    public void showQuestion() {
        IGame.printMessage(String.format("Question: %d\n", number));
    }
}
