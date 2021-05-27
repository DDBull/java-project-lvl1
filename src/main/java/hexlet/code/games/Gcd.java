package hexlet.code.games;

public final class Gcd implements IGame {

    private static final String INSTRUCTION = "Find the greatest common divisor of given numbers.";

    private int firstNumber;
    private int secondNumber;
    private String correctAnswer;

    @Override
    public void initGame() {
        firstNumber = IGame.generateRandomPositiveInteger();
        secondNumber = IGame.generateRandomPositiveInteger();

        correctAnswer = Integer.toString(findGCD(firstNumber, secondNumber));
    }

    @Override
    public String getAnswer() {
        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        IGame.printMessage(INSTRUCTION);
    }

    private int findGCD(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a % b == 0) {
            return b;
        }

        return findGCD(a - b, b);
    }

    @Override
    public void showQuestion() {
        IGame.printMessage(String.format("Question: %d %d\n", firstNumber, secondNumber));
    }
}
