package 쓰레드복습3;

public class WorkObject {
    //synchronized 동시 접근을 막음
    public int test = 100;
    public synchronized void methodA() {
        test++;
        System.out.println("Thread의 methodA() 작업 수행 : " + test);
        notify();   //일시 정지 상태에있는 ThreadB를 실행 대기 상태로 만듬
        try {
            wait(); //자신을 일시정지 상태로 만듬
        } catch(InterruptedException e) {
        }
    }

    public synchronized void methodB() {
        test++;
        System.out.println("Thread의 methodB() 작업 수행 : " + test);
        notify();   //일시 정지 상태에있는 ThreadB를 실행 대기 상태로 만듬
        try {
            wait(); //
        } catch(InterruptedException e) {
        }
    }
}
