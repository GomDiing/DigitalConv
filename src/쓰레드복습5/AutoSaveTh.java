package 쓰레드복습5;

public class AutoSaveTh extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("작업 내용을 저장 함...");
            try {
                sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
