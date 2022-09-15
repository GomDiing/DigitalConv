package 쓰레드복습2;

public class ThEx2 {
    public static void main(String[] args) {
        SumTh sumTh = new SumTh();
        sumTh.start();
        try {
            sumTh.join();
        } catch (InterruptedException e) {
        }
        System.out.println("합 : " + sumTh.getSum());
    }
}
