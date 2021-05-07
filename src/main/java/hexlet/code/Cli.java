package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void welcomeThePlayer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = input.nextLine();

        System.out.printf("Hello, %s!\n", playerName);
    }
}
