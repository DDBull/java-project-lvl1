package hexlet.code.games;

public final class Gcd implements IGame {

    @Override
    public String getAnswer() {
        int firstNumber = IGame.generateRandomPositiveInteger();
        int secondNumber = IGame.generateRandomPositiveInteger();

        showQuestion(firstNumber, secondNumber);
        int correctAnswer = findGCD(firstNumber, secondNumber);

        return Integer.toString(correctAnswer);
    }

    @Override
    public void showInstructions() {
        IGame.printMessage("Find the greatest common divisor of given numbers.");
    }

    private int findGCD(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        if (firstNumber % secondNumber == 0) {
            return secondNumber;
        }

        return findGCD(firstNumber - secondNumber, secondNumber);
    }

    private void showQuestion(final int firstNumber, final int secondNumber) {
        IGame.printMessage(String.format("Question: %d %d\n", firstNumber, secondNumber));
    }
}
