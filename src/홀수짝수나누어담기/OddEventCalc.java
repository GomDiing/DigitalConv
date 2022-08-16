package 홀수짝수나누어담기;
// 7개의 정수를 입력받아 홀수와 짝수 배열에 나누어 담기
// 입력받는 inputInt();
// 결과를 출력하는 dispOutput();
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6

import java.util.Scanner;

public class OddEventCalc {
        int[] arr = new int[7]; // 정수를 입력 받는 배열
        int[] even = new int[7]; // 입력 받은 배열에서 짝수만 담는 배열
        int[] odd = new int[7]; // 입력 받은 배열에서 홀수만 담는 배

        int oddPos = 0;
        int evenPos = 0;

    public void main() {
        inputInt();
        oddEven();
        dispOutput();
    }

    public void inputInt() {
        // 사용자로부터 7개의 정수를 입력받아 배열에 저장
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void oddEven() {
        // arr 배열에 저장된 값 중에서 홀수는 odd, 짝수는 even에 나누어 담기

        for (int e : arr) {
            if (e % 2 == 0) {
                even[evenPos++] = e;
            } else {
                odd[oddPos++] = e;
            }
        }
    }

    public void dispOutput() {
        System.out.print("홀수 :");
        for (int i = 0; i < oddPos; i++)
            System.out.print(" " + odd[i]);
        System.out.println();
        System.out.print("짝수 :");
        for (int i = 0; i < evenPos; i++)
            System.out.print(" " + even[i]);
    }
}
