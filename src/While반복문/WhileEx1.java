package While반복문;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(true) {
            System.out.println(n + " ");
            sum += n;   // sum = sum + n;
            n--;
            if (n == 0) break;
        }
        System.out.println("합계 : " + sum);
        */

        /*
        Scanner sc = new Scanner(System.in);

        int age;

        boolean isFirst = true;
        do {
            if (isFirst == false) System.out.println("나이를 잘못 계산했습니다.");
            System.out.print("나이를 먼저 입력하세요 : ");
            age = sc.nextInt();
            isFirst = false;
        } while (age <= 0 || age >= 200);
        */

        int treeHit = 0;

        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }
        for (int i = 1; i<=10; i++) {
            System.out.println("나무를 " + i + "번 찍었습니다.");
        }
        System.out.println("나무를 넘어 갑니다.");
    }
}

