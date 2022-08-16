package 스위치조건문;
// siwtch(변수) {case : }
// 계산기 만들기

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner (System.in);
        System.out.print("계산식을 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op = sc.next().charAt(0);   // 연산자

        switch(op) {
            // 각 케이스는 : 사용
            case '+': System.out.printf("덧셈 : %d\n", a + b);    break;
            case '-': System.out.printf("뺄셈 : %d\n", a - b);    break;
            case '*': System.out.printf("곱셈 : %d\n", a * b);    break;
            case '/': System.out.printf("나눗셈 : %d\n", a / b);   break;
            default : System.out.print("해당 연산자는 없습니다.\n");
        }
        */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("성별을 입력하세요 : ");
            char gender = sc.next().charAt(0);
            switch (gender) {
                case 'M':
                case 'm':
                    System.out.println("남성 입니다.");
                    break;
                case 'F':
                case 'f':
                    System.out.println("여성 입니다.");
                    break;
                default:
                    System.out.println("성별을 잘못 입력하셨습니다. 다시 입력하세요.");
                    continue;
            }
            break;
        }
    }
}