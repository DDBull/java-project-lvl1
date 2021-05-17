package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static void run(final int gameNumber) {

        switch (gameNumber) {
            case GREET -> Cli.getPlayerName();
            case EVEN -> Game.play(new Even());
            case CALC -> Game.play(new Calc());
            case GCD -> Game.play(new Gcd());
            case PROGRESSION -> Game.play(new Progression());
            case PRIME -> Game.play(new Prime());
            case EXIT -> Cli.printFinish();
            default -> Cli.printError();
        }
    }
}
