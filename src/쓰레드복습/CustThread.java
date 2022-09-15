package 쓰레드복습;

//Thread 상속받아서 만들기
public class CustThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            try {
                sleep(10); //100분의 1초동안 잠자기
            } catch (InterruptedException e) {
            }
            sum += i;
            System.out.println("쓰레드 상속 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
