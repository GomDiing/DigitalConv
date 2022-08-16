package 쓰레드9;

/*
 * DemonThread란? 다른 Thread 작업을 돕는 보조 Thread
 * 백그라운드 모드에서 돌고있는 Thread를 의미
 * setDaemon(true), 단 Thread 시작 이전에 해야 함
 * 살아이쓴ㄴ 다른 Thread가 없으면 자동 종료됨
 */

public class DemonThreadEx {
    public static void main(String[] args) {
        AutoSaveThread auto = new AutoSaveThread();
        auto.setDaemon(true); // DeamonThread로 만듬
        auto.start();
    }
}
