package 윤년구하기;
// 윤년이란? 지구가 태양을 한 바퀴 도는데 걸리는 시간 365과 1/4
// 연도가 4로 나뉘어 떨어진다
// 100으로 나뉘어 떨어지는 연도는 윤년이 아니다.
// 400으로 나뉘어 떨어지면 윤년이다.

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("연도를 입력하시오 : ");
        year = sc.nextInt();
        /*
        if (year % 4 == 0)
        {
            if (year % 100 != 0) {
                System.out.println("윤년입니다");
            }
            else if (year % 400 == 0) {
                System.out.println("윤년입니다");
            }
            else {
                System.out.println("윤년이 아닙니다");
            }
        }
        else {
            System.out.println("윤년이 아닙니다");
        }
        */

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("윤년입니다");
        }
        else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
