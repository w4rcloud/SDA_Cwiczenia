package multithreading.zad32;

import java.util.ArrayList;
import java.util.List;

public class Letters implements Runnable {

    private char[] letters;
    private List<Thread> threads = new ArrayList<>();
    private boolean running;
    private StringBuilder stringBuilder;

    public Letters(String text) {
        this.letters = text.toCharArray();
        stringBuilder = new StringBuilder();
        threads.add(new Thread(this));
        threads.add(new Thread(this));
        threads.add(new Thread(this));
        threads.add(new Thread(this));
    }


    @Override
    public void run() {
        for (char letter : letters) {
            stringBuilder.append(letter);
            if (!running) {
                System.out.println("Interruption");
                break;
            }
        }
    }

    public void startAllThreads() {
        running = true;
        for (Thread thread : threads) {
            thread.start();
        }
    }

    private void abort() {
        running = false;
    }

    public void abortAndPrintLetters() {
        abort();
        System.out.println(stringBuilder.toString());
    }

    public List<Thread> getThreads() {
        return threads;
    }
}
