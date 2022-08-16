package X보다작은수;

/*
 * 배열의 개수와 기준값을 입력받음
 * 10 (배열의 개수), 5 (기준 값)
 * 입력 : 10 5
 * 배열의 값 : 1 2 3 4 5 6 7 8 9 10
 * 결과 : 1 2 3 4
 */

import java.util.Arrays;
import java.util.Scanner;

public class XArrayEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int arrSize = sc.nextInt();
        int pivot = sc.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) arr[i] = i + 1;

        System.out.print("배열의 값 : ");
        for (int e : arr) System.out.printf("%d ",e);
        System.out.println();

        System.out.print("결과 : ");
        for (int e : arr) {
            if (e < pivot) System.out.print(e + " ");
        }
    }
}
