package hexlet.code.controller.games;

import hexlet.code.view.games.PrimeCli;

public final class Prime implements IGame {

    @Override
    public String getAnswerShowQuestion() {
        int number = IGame.generateRandomPositiveInteger();
        PrimeCli.printQuestion(number);

        String correctAnswer = isPrime(number) ? YES : NO;

        return correctAnswer;
    }

    @Override
    public void showInstructions() {
        PrimeCli.printStartingMessage("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
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
}
