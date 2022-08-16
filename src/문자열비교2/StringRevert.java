package 문자열비교2;

// 문자열 반전
// 문자열을 입력으로 사용
// 역기능으로 입력문자열을 반전하여 출력합니다.

import java.util.Scanner;

public class StringRevert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str);

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
