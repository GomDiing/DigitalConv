package 배열연습문제1;

// 10개의 정수 배열 생성, 값이 중복됨 {1,2,3,4,5,1,2,3,4,5}
// 이 중에서 찾을 값 입력 : 2 => 결과는 7이 나와야함
// 해당 값의 위치를 반환하고 찾는 값이 없으면 -1 반환

// 정수형 배열 선언
// 찾을 값을 입력받기 위한 변수 생성 및 스캐너 객체 생성
// 반복문을 순회하면서 해당값의 위치를 찾음
// 첫번째 찾은 값이 아니고 두번째 위치를 찾아야 됨

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int pos = 0;    // 배열의 위치
        int cnt = 0;    // 찾을시 카운트

        int[] array = {1,2,3,4,5,1,2,3,4,5};

        for (int e : array) {
            pos++;
            if (e == search) {
                cnt++;
                if (cnt == 2) System.out.printf("%d \n", pos);
            }
        }
        // 없거나 한번만 검색될 경우
        if (cnt < 2)    System.out.println("-1");
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 입력 : ");
        int n = sc.nextInt();

        int[] arr = {1,2,3,4,5,1,2,3,4,5};
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                cnt++;
                if (cnt == 2) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
        if (cnt < 2) System.out.println("-1");
    }
}
