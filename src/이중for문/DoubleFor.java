package 이중for문;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            System.out.printf("|i = %d|\n", i);
            for (int j = 0; j < 10; j++) {
                for (int k=0; k<10; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }
        */

        /*
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, (i*j));
            }
            System.out.println();
        }
        */

        //정수 n(4)를 입력받아서 별찍기
        //*
        //* *
        //* * *
        //* * * *
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/
        /*
        while (true) {
            // 1부터 6까지의 난수가 만들어짐
            int num1 = (int)((Math.random() * 6)) + 1;
            int num2 = (int)((Math.random() * 6)) + 1;
            System.out.println("주사위의 합 : " + (num1 + num2));
        }
        */

        //입력 받은 수가 소수인지 아닌지 판별하기
        //소수란? 1과 자기자신 이외의 수로는 나누어지지 않는 수를 의미함

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=2; i<n; i++) {
            if (n%i == 0) {
                System.out.println("소수가 아닙니다");
                return;
            }
        }
        System.out.println("소수입니다");
        */

        //어드밴스 문제 : n의 수를 입력받아 범위 내의 소수의 합을 구하기

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int notPrime = 0;
        int prime = 0;
        int total_prime = 0;

        for (int j = 2; j < n; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    notPrime++;
                }
            }
            prime = j;
            if (notPrime == 0) {
                total_prime += prime;
            }
            notPrime = 0;
            prime = 0;
        }
        System.out.println(total_prime);
    }
    // 메소드문 만들어서 해보기
}
