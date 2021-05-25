package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static void main(String[] args) {
        int gameNumber = Cli.getGameChoice();

        switch (gameNumber) {
            case GREET -> Cli.getPlayerName();
            case EVEN -> Engine.play(new Even());
            case CALC -> Engine.play(new Calc());
            case GCD -> Engine.play(new Gcd());
            case PROGRESSION -> Engine.play(new Progression());
            case PRIME -> Engine.play(new Prime());
            case EXIT -> Cli.printFinish();
            default -> Cli.printError();
        }
    }
}
