package 쓰레드5;

/*
 * wait() : 해당 Thread를 일시 정지상태로 만듬
 * notify() : 일시정지에있는 다른 Thread를 실행 대기상태로 만듬
 * notifyAll() : wait()에 의해 일시 정지된 모든 Thread를 실행 대기상태로 만듬
 */

public class ThreadMainEx5 {
    public static void main(String[] args) {
        WorkObject shareObject = new WorkObject();
        ThreadA threadA = new ThreadA(shareObject);
        ThreadB threadB = new ThreadB(shareObject);
        threadA.start();
        threadB.start();
    }
}
