package multithreading.zad30;

public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10_001; i++) {
            System.out.println(i + "bbbbbbbbbbbbbbbbbbb");
        }
    }
}
