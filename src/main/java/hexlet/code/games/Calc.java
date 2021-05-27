package hexlet.code.games;

public final class Calc implements IGame {

    private static final String INSTRUCTION = "What is the result of the expression?";

    private int firstNumber;
    private int secondNumber;
    private char operator;
    private String correctAnswer;

    @Override
    public void initGame() {
        firstNumber = IGame.generateRandomInteger();
        secondNumber = IGame.generateRandomInteger();

        char[] availableOperators = {'+', '-', '*'};
        operator = availableOperators[IGame.generateRandomInteger() % availableOperators.length];

        correctAnswer = Integer.toString(calculateAnswer());
    }

    @Override
    public String getAnswer() {
        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        IGame.printMessage(INSTRUCTION);
    }

    @Override
    public void showQuestion() {
        IGame.printMessage(String.format("Question: %d %c %d\n", firstNumber, operator, secondNumber));
    }

    private int calculateAnswer() {
        switch (operator) {
            case '+' -> {
                return firstNumber + secondNumber;
            }
            case '-' -> {
                return firstNumber - secondNumber;
            }
            default -> { // multiplication
                return firstNumber * secondNumber;
            }
        }
    }
}
