package 평균은넘겠지;

import java.util.Scanner;
/*
 * 테스트 케이스 개수가 주어짐
 * 각 테스트 케이스에 해당하는 학생수와 성적 입력
 * 결과는 평균은 넘은 학생에 대한 %를 출력 (소수점 3자리수까지 출력)
 */
public class OverScoreMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트케이스를 입력받기위한 변수생성 (Scanner 입력)
        int testCnt = sc.nextInt();
        // 각 테스트 케이스에대한 결과를 반환받기위한 실수형 배열 생성
        double[] result = new double[testCnt];
        // 테스트 케이스에 해당하는 회수만큼 메소드 호출
        for (int i = 0; i < testCnt; i++) {
            result[i] = overRate();
        }

        // 반환된 결과값을 출력
        for (double e : result)
            System.out.printf("%.3f%%\n",e);

    }
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        // 각 테스트 케이스에 해당하는 학생 수 입력받기
        int stCnt = sc.nextInt();
        int[] score = new int[stCnt]; // 학생의 수 만큼 성적을 입력받기위한 배열 생성
        int total = 0; // 평균을 구하기위해서 학생의 성적을 합산함
        int overCnt = 0; // 평균을 넘는 학생수 계산
        // 반복문을 순회하면서 학생의 수만큼 성적 입력 받기
        for (int i = 0; i < stCnt; i++) {
            score[i] = sc.nextInt();
            total += score[i]; // 하생의 성적을 누적함
        }

        double avg = (double)total / stCnt; // 평균 구하기
        // 평균을 넘는 학생 수 구하기
        for (int e : score) {
            if (e > avg) overCnt++;
        }

        return (double)overCnt / stCnt * 100;
    }

}
