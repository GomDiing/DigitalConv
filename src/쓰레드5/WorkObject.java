package 쓰레드5;


// 작업 공유용 Class
public class WorkObject {
    // synchronizoed는 thread의 동시 접근에대한 허용을 막음
    public synchronized void methodA() {
        System.out.println("Thread methodA() 작업 실행");
        notify(); // 일시 정지상태에있는 ThreadB를 실행 대기상태로 만듬
        try {
            wait(); // ThreadA를 일시 정지상태로 만듬
        } catch (InterruptedException e) {
        }
    }

    public synchronized void methodB() {
        System.out.println("Thread methodB() 작업 실행");
        notify(); // 일시 정지상태에있는 ThreadA를 실행 대기상태로 만듬
        try {
            wait(); // ThreadB를 일시 정지상태로 만듬
        } catch (InterruptedException e) {

        }
    }
}
