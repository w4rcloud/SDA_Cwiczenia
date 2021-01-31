package multithreading.zad31;

public class ConcatenationTask implements Runnable {

    private String text;
    private int occurrences;
    private String result = "";
    private int resultLength;
    private Thread thread;
    private boolean running;

    public ConcatenationTask(String text, int occurrences) {
        this.text = text;
        this.occurrences = occurrences;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < occurrences; i++) {
            result += text;
            if (!running) {
                System.out.println("Error at " + i);
                return;
            }
        }
    }

    public void startTask() {
        running = true;
        thread.start();
    }

    public void abort(){
        running = false;
    }

    public void waitForTaskToEnd() throws InterruptedException {
        thread.join();
    }

    public String getResult() {
        return result;
    }
}
