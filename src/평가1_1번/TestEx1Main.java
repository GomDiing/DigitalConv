package 평가1_1번;

import java.util.Scanner;

public class TestEx1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 반복문의 진입 조건은 참이어야 한다. (1번 문제)
        while (true) {
            System.out.print("문자열을 입력 하세요 : ");
            // 문자열을 입력받기위한 String 변수를 선언하고 문자열 대입
            String str = sc.nextLine();
            // == 참조가 같은지 비교, 실제 문자열을 비교하는 메소드 equals
            if (str.equals("exit")) break;
            else {
                System.out.println(str.length() + "글자 입니다.");
            }
        }
    }
}
