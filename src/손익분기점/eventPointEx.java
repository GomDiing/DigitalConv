package 손익분기점;

// 월드전자에서 생산하는 노트북이 몇대 팔려야 이익이 발생하는가를 묻는 문제
// 입력 : 고정비용 가변비용 판매단가
// 몇 대를 팔아야 손익분기점을 달성하는가를 묻는 문제
// 손익분기점이 존재하지 않으면 -1

import java.util.Scanner;

public class eventPointEx {
    public static void main(String[] args) {
        // Scanner 객체를 생성해서 고정비용 가변비용 생산비용을 입력받음
        // 손익분기점을 달성할 수 없으면 -1을 출력하고 끝냄
        // 손익분기점 달성 여부 확인은 반복문을 사용해도되고 공식을 이용해도 됨
        // 결과 출력은 판매 대수

        Scanner sc = new Scanner(System.in);

        int breakEvent = -1;
        int cnt = 0;

        int fixCost = sc.nextInt();     // 고정비용
        int varCost = sc.nextInt();     // 가변비용
        int selPrice = sc.nextInt();    // 판매비용

        if (varCost >= selPrice) {
            System.out.println("-1");
            return;
        }
/*
        for (int i = 1; i <= 2100000000; i++ ) {
            if (fixCost + (varCost * i) < (selPrice * i)) {
                System.out.println(i);
                breakEvent = i;
                break;
            }
        }
        if (breakEvent == -1) System.out.println("-1");

        */
        /*
        // case 1 : 틀렸다, 정수 overflow 발생
        while (true) {
            if (fixCost + (varCost * cnt) < (selPrice * cnt)) break;
            cnt++;
        }
        System.out.println(cnt);
        */
        /*

        // case 2 : 맞지만 while문 필요없다
        while (true) {
            if(cnt > fixCost / (selPrice - varCost)) break;
        }
        System.out.println(cnt);
        */

        // case 3 : 의도한 정답
        System.out.println((fixCost / (selPrice - varCost)) + 1);
    }
}
