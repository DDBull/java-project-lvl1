package hexlet.code.view.games;

import hexlet.code.view.Cli;

public class CalcCli extends Cli {

    public static void printQuestion(int firstNumber, int secondNumber, char operator) {
        System.out.printf("Question: %d %c %d\n", firstNumber, operator, secondNumber);
    }
}
