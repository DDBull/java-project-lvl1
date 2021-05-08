package hexlet.code.view;

import java.util.Scanner;

public class Cli {

    public static int chooseGame() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = input.nextInt();
        System.out.println();

        return choice;
    }

    public static String getPlayerName() {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = input.nextLine();

        System.out.printf("Hello, %s!\n", playerName);
        return playerName;
    }

    public static void finishTheApp() {
        System.out.println("Quitting the game. Bye!");
    }

    public static void printError() {
        System.out.println("ERROR! Invalid input!");
        finishTheApp();
    }

    public static void printCongratulations(String playerName) {
        System.out.printf("Congratulations, %s!\n", playerName);
    }

    public static void printCorrect() {
        System.out.println("Correct!");
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).nextLine();
    }

    public static void printStartingMessage(String message) {
        System.out.println(message);
    }
}
