package 배수구하기;

public class ForEx3 {
    public static void main(String[] args) {
        int cnt = 0;    // 출력 횟수를 확인하기위해서 사용
        for (int i = 7; i < 1000; i ++) {   // for문은 3개의 실행문으로 이루어져있음
            if (i % 7 == 0) {   // i 나누기 7을해서 나머지가 0인 경우는 7의 배수를 의미
                System.out.println(i + " ");    // 7의 배수를 출력하고, 공백 한칸을 둠
                cnt++;
                if (cnt == 10) {
                    System.out.printf("\n");
                    cnt = 0;    // 줄을 바꿧기때문에 cnt를 0으로 초기화함
                }
            }
        }
    }
}
