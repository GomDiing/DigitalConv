package For문으로성적구하기;

import java.util.Scanner;

public class ForTotalAndAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));  // new 키워드로 객체 생성
        int total = 0;  // 총점을 구하기 위한 변수
        int n = sc.nextInt();   // Scanner 객체에서 정수를 입력받는 메소드
        // n의 숫자만큼 반복 수행 (성적을 입력받기 위해서...)
        System.out.print("과목 개수에 대한 성적 입력 : ");
        for (int i = 0; i < n; i++) {   // 0에서부터 n보다 작은 동안
            total += sc.nextInt();  // total = total + sc.nextInt();
        }
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n",(double)total/n);
    }
}
