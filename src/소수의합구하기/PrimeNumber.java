package 소수의합구하기;

import java.util.Scanner;

/*
 * 입력받은 정수보다 작은 소수의 합을 구하는 문제
 * 메소드를 이용해서 처리
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // n보다 작은 소수의 합을 구하기위한 변수
        int n = sc.nextInt(); // n보다 작은 소수의 합 구하기위해 정수 입력받음
        for (int i = 2; i < n; i++) { // 1과 자기자신은 제외하기위한 반복문 범위
            sum += primeFunc(i); // 해당 인덱스가 소수인지 확인
        }
        System.out.println(sum);
    }

    /*
     * PrimeSumEx rㅐㄱ체로 생성하지않고 사용하기위해서 static 처리
     * 매개변수를 정수로 입력받아 정수값을 반환하는 메소드
     */

    static int primeFunc(int n) {
        boolean isPrime = true; // 기본 값을 소수로 설정
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false; // 1과 자신 이외에 나누어짐
        }
        if (isPrime) return n;
        else return 0;
    }

    public void mySolve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        total = isPrime(n);

        System.out.println(total);
    }

    public static int isPrime(int n) {
        int cnt = 0;
        int total = 0;

        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    cnt++;
            }
            if (cnt == 0) total += i;
            else cnt = 0;
        }
    return total;
    }
}
