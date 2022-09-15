package 쓰레드복습3;

public class ThEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 공유 객체 생성
        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}
