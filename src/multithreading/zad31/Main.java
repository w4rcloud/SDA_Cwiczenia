package multithreading.zad31;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ConcatenationTask task = new ConcatenationTask("D", 1_000_000);
        task.startTask();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                task.abort();
            }
        });

        thread.start();

        task.waitForTaskToEnd();
        System.out.println(task.getResult().length());
    }
}
