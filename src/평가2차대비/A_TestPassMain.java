package 평가2차대비;

import java.util.Scanner;

/*
 * [프로그래밍 응용]
 * 1. 메소드 오버로딩을 묻는 문제
 * 메소드 오버로딩 : 동일한 메소드 이름을 가지고
 * 매개변수의 개수와 타입으로 다양한 메소드를 호출하는 다형성에대한 객체지향문법을 의미
 * 반환값은 의미없음
 * 2. 사용자가 입력한 값의 합을 구하는 문제, 0보다 큰 숫자 입력
 * 0 이하의 숫자가오면 1 이상의 숫자를 입력하라고 해야함.
 */
public class A_TestPassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt(); // 정수를 입력받음
        int sum = 0; // 합을 계산하기위해서는 값을 누적해야함으로 반드시 초기화가 필요
        if (num >= 0) { // 조건 체크 확인 필요 (문제^^)
            int i = 1;
            while (i <= num) { // 반복문의 문제를 i값을 변경해주는 코드가 없음
                sum += i;
                i++; // i의 값을 변경해주는 코드가 필요함 (문제^^)
            }
            System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
        } else {
            System.out.println("숫자가 1이상이어야 합니다");
        }
    }

}
