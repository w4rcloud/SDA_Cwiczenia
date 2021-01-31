//package gamemachine;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.EnumSet;
//import java.util.List;
//
//public class GameMachine {
//
//    private List<Game> games = new ArrayList<>();
//
//    void addGames(Game... gamesToAdd) {
//        games.addAll(Arrays.asList(gamesToAdd));
//    }
//
//    public List<Game> getGames() {
//        return games;
//    }
//
//    public void buyGame(String title, int amountOfMoney) throws NoSuchGameException, InsufficientFundsException {
//
////                if (game.getPrice() <= amountOfMoney) {
////                    int change = amountOfMoney - game.getPrice();
////                    System.out.printf("%s bought. Your change: %d\n", title, change);
////
////                    break;
////                } else {
////                    throw new InsufficientFundsException(String.format("%d is not enough to buy %s\n", amountOfMoney,
////                            title));
////                }
//            }
//        }
//
//    }
//
//    private List<Game> searchForGame(String title){
//        for (Game game : games) {
//        if (game.getTitle().equals(title)) {
//        games.remove(game);
//        return games;
//        }
//        throw new NoSuchGameException(String.format("There is no game matching the title \"%s\"\n",
//        title));
//    }
//}