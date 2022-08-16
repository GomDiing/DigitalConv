package 알고리즘_나머지;

// 10개의 수를 입력받음
// 입력 받은 수를 42로 나눈 나머지 중 다른게 몇 개인지 출력

import java.util.Scanner;

public class ModMainEx {
    public static void main(String[] args) {
        // 10개의 임의 수를 입력받기위한 Scanner 생성
        // 42로 나눈 나머지는 0 ~ 41까지이기에 42의 정수배열 만들기
        // 임의의 10개의 정수 입력 받기 위해 반복문 만들기
        // 반복문 돌면서 임의의 정수값을 입력받고 42로 나눈 배열에 1을 넣음
        // 42개로 만들어진 배열을 순회하면서 값을 더해줌
        // 결과 출력


        Scanner sc = new Scanner(System.in);
        int cnt = 0; // 중복된 개수를 누적하기 위한
        int n = 10;

        int[] arr = new int[42];
        int x; // 입력받기 위한 변수
        // 반복문을 돌면서 임의의 정수
        for (int i = 0; i < n; i++) {
            x = sc.nextInt(); // 임의의 정수값을 입력받음
            // System.out.println(x % 42);
            arr[x % 42] = 1;
        }

        // for 문을 돌면서 1인 값을 다 더해줌
        for (int i = 0; i < 42; i++) {
            if (arr[i] == 1) cnt++;
        }

        System.out.println(cnt);
    }
}
