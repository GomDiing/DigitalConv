package 쓰레드복습4;

public class RunTh1 extends Thread{
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void run() {
        while(!stop) {
            System.out.println("Thread 실행 중......");
        }
        System.out.println("자원 정리...");
        System.out.println("실행 종료");
    }
}
