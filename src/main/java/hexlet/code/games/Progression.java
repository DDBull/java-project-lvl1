package hexlet.code.games;

public final class Progression implements IGame {

    private static final String INSTRUCTION = "What number is missing in the progression?";
    private static final String QUESTION = "Question: ";
    private static final int SERIES_LENGTH = 10;

    private int[] series = new int[SERIES_LENGTH];
    private int elementToHide;
    private String correctAnswer;

    @Override
    public void initGame() {
        series[0] = IGame.generateRandomInteger();
        int step = IGame.generateRandomInteger() - IGame.generateRandomInteger();

        for (int i = 1; i < SERIES_LENGTH; i++) {
            series[i] = series[i - 1] + step;
        }

        elementToHide = series[IGame.generateRandomInteger() % SERIES_LENGTH];
        correctAnswer = Integer.toString(elementToHide);
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
        System.out.print(QUESTION);

        for (int i = 0; i < SERIES_LENGTH; i++) {
            if (series[i] == elementToHide) {
                System.out.print(".. ");
            } else {
                System.out.printf("%d ", series[i]);
            }
        }
        System.out.println();
    }
}
