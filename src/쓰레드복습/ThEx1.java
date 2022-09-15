package 쓰레드복습;

public class ThEx1 extends Thread {
    public static void main(String[] args) {
        // 쓰레드 클래스를 상속 받아 만듬
        Thread custThread = new CustThread();
        custThread.start();
        // Runnable 인터페이스 상속 받기
        Runnable task = new RunThread(); //RunThread는 작업 내용은 가지고 있지만 쓰레드는 아니다
        Thread runThread = new Thread(task);
        runThread.start();

        // 익명의 쓰레드 생성
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    try {
                        sleep(10); //100분의 1초동안 잠자기
                    } catch (InterruptedException e) {
                    }
                    sum += i;
                    System.out.println("익명 쓰레드 : " + sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };

        Thread anonymousTh = new Thread(task2);
        anonymousTh.start();

        Runnable task3 = () -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                try {
                    sleep(10); //100분의 1초동안 잠자기
                } catch (InterruptedException e) {
                }
                sum += i;
                System.out.println("익명 쓰레드 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };

        Thread lambdaTh = new Thread(task3);
        lambdaTh.start();

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            try {
                sleep(10); //100분의 1초동안 잠자기
            } catch (InterruptedException e) {
            }
            sum += i;
            System.out.println("메인 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
