package 배열연습문제2;

import java.util.Scanner;

public class ArrayEx2T {
    public static void main(String[] args) {

        int[] score = new int[5];
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적 입력 : ");
        // 선언된 배열에 5명의 성적을 받기 위해서 스캐너 생성

        // 반복문을 통해서 5명의 성적을 배열에 입력 받음
        for (int i = 0; i < score.length; i++) {
            // 5명의 성적을 입력 받아서 배열에 넣어 둠
            int tmp = sc.nextInt();
            //score[i] = sc.nextInt();

            if (tmp % 5 != 0) {
                System.out.println("성적이 잘 못 입력되었습니다.");
                i--;
                System.out.println(i);
                continue;
            }

            else {
                score[i] = tmp;
                System.out.println(i);
            }
            // 성적이 40명 이하인 경우 40으로 조정
            if (score[i] < 40) score[i] = 40;
            // 변경된 성적으로 총점 구하기
            total += score[i]; // score[0 - 4] 끼지의 성적을 total에 누적
        }

        // 총점으로 평균을 계산해줌
        System.out.println(total / score.length);
    }
}
