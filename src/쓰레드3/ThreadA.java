package 쓰레드3;

public class ThreadA extends Thread {
    boolean stop = false; // 종료 flag
    boolean work = true; // 작덥 진행 여부 flag

    public void run() {
        while (!stop) {
            if (work) System.out.println("Thread A가 작업중입니다");
            else Thread.yield();
        }
    }
}
