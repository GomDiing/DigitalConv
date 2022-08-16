package for반복문;
// for(초기식;최종식;증가식) {참인동안 수행되는 문장;}
// 1번
// 1-1000 사이의 7의 배수를 구하고 한 줄에 10개씩 출력

// 2번
// 정수 n을 입력받아 n * n 출력하기 (1부터 시작~~)
// Input n : 3
// Output
//  1 2 3
//  4 5 6
//  7 8 9

// 3번
// 정수 입력을 받음(5), 입력 받은 수만큼의 성적 입력 받기, 총점과 평균 구하기

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        /*
        for(int i=1; i<=100; i++) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) System.out.print("\n");
        }
        System.out.println();
        */

        //1-1
        /*
        int pos=0;
        for (int i=1; i<=1000; i++) {
            if (i % 7 == 0) {
                System.out.printf("%5d", i);
                pos++;
                if (pos % 10 == 0)
                    System.out.print("\n");
            }
        }
        */

        //1-2
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int n = sc.nextInt();

        System.out.println("출력 : ");
        for (int i=1; i<=1000; i++) {
            if (i % 7 == 0) {
                System.out.printf("%4d", i);
                if (i % 70 == 0) {
                    System.out.println();
                }
            }
        }
        */

        //2-1
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int n = sc.nextInt();
        int number=1;

        System.out.println("출력 : ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("%4d",number);
                number++;
            }
            System.out.println();
        }
        */

        //3
        Scanner sc = new Scanner(System.in);

        int number_subject;
        int total = 0;

        System.out.print("입력하시오 : ");
        number_subject = sc.nextInt();

        for (int i=0; i<number_subject; i++) {
            System.out.print("성적점수 입력하시오 : ");
            total += sc.nextInt();
        }

        // System.out.println("총점 : " + total + ", 평균 : " + total/number_subject);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", (double)total/number_subject);
    }
}
