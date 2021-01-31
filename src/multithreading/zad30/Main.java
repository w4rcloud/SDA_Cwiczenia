package multithreading.zad30;

public class Main {

    public static void main(String[] args) {

        Runnable task1 = () -> {
            for (int i = 1; i < 10_001; i++) {
                System.out.println(i + "aa");
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(new Task());
        thread1.start();
        thread2.start();
    }
}
