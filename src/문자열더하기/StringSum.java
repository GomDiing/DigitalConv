package 문자열더하기;

// N개의 숫자가 공백없이 입력됩니다. (12345)
// 15
// Str.lengh()

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
