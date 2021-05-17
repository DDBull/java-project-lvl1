package hexlet.code;

public class App {

    public static void main(String[] args) {
        int gameNumber = Cli.getGameChoice();

        Engine.run(gameNumber);
    }
}
