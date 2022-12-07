package sandbox;

public class MyThread extends Thread {

    private boolean threadClose;

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.close();
    }

    @Override
    public void run() {
        try {
            while (!threadClose) {
                Thread.sleep(500);
                System.out.println("Thread is work");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is closed");
    }

    public boolean isClosed() {
        return threadClose;
    }

    public void close() {
        threadClose = true;
    }
}
