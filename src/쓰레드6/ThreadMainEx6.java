package 쓰레드6;

import java.util.Scanner;

/*
 * Thread의 안전한 종료 방법 : stop Thread, interrupt()
 * stop flag (true / false) 이용 방법
 */
public class ThreadMainEx6 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        Scanner sc = new Scanner(System.in);
        String isQuit;
        runThread.start();
        while (true) {
            System.out.println("실행을 중지하시겠습니까? (quit/no) : ");
            isQuit = sc.next();
            if (isQuit.equalsIgnoreCase("quit")) {
                Thread.sleep(5000);
                runThread.setStop(true);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
