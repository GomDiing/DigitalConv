package 쓰레드4;

/*
 * Join() : Thread는 기본적으로 Thread간에 독립적으로 수행되는것이 원칙
 * 경우에따라서는 다른 Thread의 결과 이후에 수행되어야할 일이 발생함
 * 이런 경우 join(시간을 안주면 끝날때까지 대기) 메소드 사용
 */

public class ThreadMainEx4 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(10);
        } catch (InterruptedException e) {

        }

        System.out.println("sumThread의 결과 : " + sumThread.getSum());
    }
}
