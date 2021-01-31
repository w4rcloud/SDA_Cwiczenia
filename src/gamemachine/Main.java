//package gamemachine;
//
//public class Main {
//    public static void main(String[] args) {
//        GameMachineController controller = new GameMachineController(new GameMachine());
//        controller.addGames(new Game("Half Life", 10),
//                            new Game("StarCraft", 15),
//                            new Game("Warcraft 3", 20),
//                            new Game("Wacki", 5),
//                            new Game("Soul Calibur 4", 55));
//
//        System.out.println(controller.getGames());
//
//        try {
//            controller.buyGame("Warcraft 3", 50);
////            controller.buyGame("Heroes 3", 10);
//            controller.buyGame("Wacki", 1);
//        } catch (NoSuchGameException | InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(controller.getGames());
//    }
//}
