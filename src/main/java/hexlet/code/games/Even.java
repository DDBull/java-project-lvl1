package hexlet.code.games;

public final class Even implements IGame {

    private static final String INSTRUCTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private int number;
    private String correctAnswer;

    @Override
    public void initGame() {
        number = IGame.generateRandomInteger();
        correctAnswer = isEven() ? YES : NO;
    }

    @Override
    public String getAnswer() {
        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        IGame.printMessage(INSTRUCTION);
    }

    private boolean isEven() {
        return number % 2 == 0;
    }

    @Override
    public void showQuestion() {
        IGame.printMessage(String.format("Question: %d\n", number));
    }
}
