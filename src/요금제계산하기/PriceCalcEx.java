package 요금제계산하기;

import java.util.Scanner;
/*
 * 민식(M) 요금제 : 30초당 10원 (30초가되면 2통이 됨)
 * 영식(Y) 요금제 : 60초당 15원 (60초가되면 2통이 됨)
 * 입력 : 통화 횟수가 첫째줄에 입력되고 통화 횟수에대한 시간이 각각 입력됨
 * 만약 총 요금이 같은 경우 Y M 통화요금
 * 3(통화 횟수) : 총 통화 횟수는 20을 넘지 않는다.
 * 통화횟수 : 3
 * 통화시간 : 40 40 40
 * 요금제 및 요금 : M 45
*/
public class PriceCalcEx {
    public static void main(String[] args) {
        /*
         * 통화 시간에 대한 배열을 만듬 (20개)
         * Scanner를 만들어 통화횟수 입력받음
         * 반복문 돌면서 통화횟수에대한 통화시간을 배열에 넣음
         * 통화횟수만큼 반복문 돌면서 요금을 계산해서 누적함
         * 영식 요금제와 민식 요금제를 비교해서 싼 요금제를 출력ㄷ함
         * 같으면 Y M 으로 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("통화횟수 : ");
        int n = sc.nextInt();
        int[] call = new int[n];

        System.out.print("통화 시간 : ");
        for (int i = 0; i < n; i++) {
            call[i] = sc.nextInt();
        }

        int mPrice = 0, yPrice = 0;

        for (int i = 0; i < n; i++) yPrice += (call[i] / 30 * 10) + 10;
        for (int i = 0; i < n; i++) mPrice += (call[i] / 60 * 15) + 15;

        System.out.print("요금제 및 요금 : ");
        if (yPrice < mPrice) System.out.println("Y " + yPrice);
        else if (yPrice > mPrice) System.out.println("M " + mPrice);
        else System.out.println("Y M " + yPrice);
    }
}
