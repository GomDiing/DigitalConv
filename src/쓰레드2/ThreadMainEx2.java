package 쓰레드2;

/*
 * sleep() : 실행중인 Thread를 일정시간 멈추고 싶을대 사용
 * Thread.sleep(시간) : 시간은 1000분의 1초 단위
 * Thread.sleep(시간) 메소드를 호출한 Thread는 주어진 시간동안 일시정지 상태가되고,
 * 시간이 지나면 실행대기 상태가 됩니다.
 * sleep 상태에서는 interruptException을 발생시킬 수 있습니다.
 * 즉, interrupt() 메소드 호출시 주어진 시간 경과하지 않더라도 깨어남
 */

import java.awt.*;

public class ThreadMainEx2 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep(); // Beep 소리 출력
            try {
                Thread.sleep(3000); // 3초 동안 잠자기
            } catch (InterruptedException e) {
                System.out.println(e); // e는 예외상황에대한 에러문구출력
            }
        }
    }
}
