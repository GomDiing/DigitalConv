package 자리수게산;
// 100자리의 정수를 입력받아서 3개의 변수에 대입

import java.util.Scanner;

public class ModEx2 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("100자리 정수를 입력하시오 : ");
        int number = sc.nextInt();
        int mid_max, max;

        int a = number / 100;
        int second_number = number % 100;

        int b = second_number / 10;
        int c = second_number % 10;

        System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);

        mid_max = ((a > b) ? a : b);
        max = (mid_max > c) ? mid_max : c;

        System.out.println("가장 큰 숫자는 " + max + "입니다.");
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;
        if (a>b) {
            /*
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
            */
            System.out.println(Math.max(a,c));
        }
        else {
            /*
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);
            */
            System.out.println(Math.max(b,c));
        }
    }
}
