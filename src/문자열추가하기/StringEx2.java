package 문자열추가하기;

import java.util.Scanner;

/**
 * 2개의 문자열 입력 받음, 정수 개수 만큼의 문자열을 첫 번째 문자열 뒤에서부터 자름
 * 두번째 문자열 앞에 붙임
 * 첫번째 : seoul
 * 두번째 : korea
 * 정수 : 2
 * 결과 : ulkorea
 */


public class StringEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 문자열 : ");
        String strFirst = sc.next();
        System.out.print("두번째 문자열 : ");
        String strSecond = sc.next();
        System.out.print("정수 : ");
        int n = sc.nextInt();
        int pos = strFirst.length() - n;

        String strSub = strFirst.substring(pos);

        String result = String.format("%s%s",strSub,strSecond);
        System.out.println(result);
    }
}
