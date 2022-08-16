package 시스템클래스;

import static java.lang.Thread.sleep;

public class SystemMain {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0; // 총 검색 홋수
        int randVal = (int) (Math.random() * 1000) + 1;
        for (int i = 0; i < 1000; i ++) {
            data[i] = i + 1;
        }

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            cnt++;
            sleep(1);
            if (randVal == data[i]) {
                System.out.println("찾은 위치 : " + (i + 1));
                break;
            }
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간은 " + (timeEnd - timeStart) + "밀리초 입니다.");
    }
}
