package 쓰레드복습4;

import static java.lang.Thread.sleep;

public class ThEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunTh1 runTh1 = new RunTh1();
        runTh1.start();
        sleep(1000);
        runTh1.setStop(true);
    }
}
