package 소수판별하기;

import java.util.Scanner;

public class IsPrimeEx1 {
    public static void main(String[] args) {
        boolean isPrime = true;     // 초기 조건을 소스라고 정의하고 시작함
        Scanner sc = new Scanner(System.in);    // 입력을 받기 위해
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        // i의 범위가 n보다 작은동안 수행함으로 자기자신을 제외
        for (int i = 2; i < n; i++) {
            System.out.println("테스트 : " + i);
            if (n % i == 0) isPrime = false;
        }
        if(!isPrime) System.out.println("소수가 아닙니다");
        else System.out.println("소수입니다");
    }
}
