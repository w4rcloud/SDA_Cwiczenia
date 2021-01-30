public class ExceptionFactory {

    public static void getNoSuchGameException(String title) throws NoSuchGameException {
            throw new NoSuchGameException(String.format("There is no game matching the title \"%s\"\n",
                    title));
    }

    public static void getInsufficientFundsException(String title, int amount) throws InsufficientFundsException {
            throw new InsufficientFundsException(String.format("%d is not enough to buy %s\n", amount,
                    title));
    }
}
