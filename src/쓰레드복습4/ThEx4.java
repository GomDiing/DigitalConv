package 쓰레드복습4;

import static java.lang.Thread.sleep;

public class ThEx4 {
    public static void main(String[] args) throws InterruptedException {
        /*RunTh1 runTh1 = new RunTh1();
        runTh1.start();
        sleep(1000);
        runTh1.setStop(true);*/
        RunTh2 runTh2 = new RunTh2();
        runTh2.start();
        sleep(1000);
        runTh2.interrupt();
    }
}
