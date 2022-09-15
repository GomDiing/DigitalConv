package 쓰레드복습;

import static java.lang.Thread.sleep;

public class RunThread implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            try {
                sleep(10); //100분의 1초동안 잠자기
            } catch (InterruptedException e) {
            }
            sum += i;
            System.out.println("인터페이스 상속 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
