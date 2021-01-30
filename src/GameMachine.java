import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameMachine {

    protected List<Game> games = new ArrayList<>();
    protected int money = 0;

    protected List<Game> addGames(Game... gamesToAdd) {
        games.addAll(Arrays.asList(gamesToAdd));
        return games;
    }

    public List<Game> getGames() {
        return games;
    }

    public List<Game> buyGame(String title, int amountOfMoney) throws NoSuchGameException, InsufficientFundsException {
        List<Game> toRemove = new ArrayList();
        for (Game game : games) {
            if (game.getTitle().equals(title)) {
                if (game.getPrice() <= amountOfMoney) {
                    int change = amountOfMoney - game.getPrice();
                    System.out.printf("%s bought. Your change: %d\n", title, change);
                    games.remove(game);
                    return games;
                } else {
                    throw new InsufficientFundsException(String.format("%d is not enough to buy %s\n", amountOfMoney,
                            title));
                }
            }
        }
        throw new NoSuchGameException(String.format("There is no game matching the title \"%s\"\n",
                title));
    }
}