package 쓰레드7;

public class ThreadMainEx7 {
    public static void main(String[] args) throws InterruptedException {
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(1000);
        interruptThread.interrupt();
    }
}
