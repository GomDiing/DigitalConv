package 배수찾기;

/*
 * 첫째줄에 n값 입력받음 (n값이 3이라 가정하고...)
 * 둘째 줄부터 입력받는수가 n의 배수인지 확인하는 문제 (0이 입력될때까지 계속 수행)
 * 예를들어 99가 입력되면 "99 is a mutiple of 3."
 * 예를들어 7이 입력되면 "7 is NOT a multiple of 3."
 * 0이 입력되면 종료
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args) {
        /*
         * ArrayList 생성하기
         * Keyboard 입력을 받기위한 Scanner 생성
         * n값을 입력받기
         * 무한의 횟수를 반복하는 반복문 만들기 (탈출조건은 0 입력)
         * 반복문을 돌면서 계속 값을 입력받아 List에 담기 (add)
         * 반복문이 끝나면 다시 반복문을 돌면서 배수인지 아닌지 확인해서 출력)
         * 결과는 한번에 출력
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arrayList = new ArrayList<>();

        while (true) {
            int x = sc.nextInt();
            if (x == 0) break;
            arrayList.add(x);
        }

        for (Integer e : arrayList) {
            if (e % n == 0) System.out.println(e + " is a multiple of " + n);
            else System.out.println(e + " is NOT a multiple of " + n);
        }

    }
}
