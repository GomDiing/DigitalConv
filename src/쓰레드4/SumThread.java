package 쓰레드4;

import static java.lang.Thread.sleep;

public class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(1);
                sum += i;
            }
        }
        catch (InterruptedException e) {}
    }
}
