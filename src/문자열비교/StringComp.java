package 문자열비교;
// 사용자에의해 두 개의 문자열을 입력한다
// 처음부터 두 개의 문자열을 비교하여 공통의 글자가 몇 개인지 확인합니다.
// 공통부분 문자열과 그 길이를 인쇄합니다.
// 부분 문자열이 없으면 "No CS"로 인쇄하고 0의 길이로 인쇄합니다.
// String str = sc.next();
// 문자열의 길이를 확인하는 방법 : str.length()
// 문자열에서 한 개의 문자를 비교하는 방법은 str.charAt(인덱스)
// ABCDEF
// ABCDDD
// ABCD

import java.util.Scanner;

public class StringComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1_pos = 0, s2_pos = 0;
        String s1 = sc.next();
        String s2 = sc.next();
        int[] arr_s1 = new int[s1.length()];
        int[] arr_s2 = new int[s2.length()];

        int start, end;

        for (int i = 0; i < s1.length(); i++) {
            arr_s1[i] = dupli(i, s2_pos, s1, s2);
            System.out.println("arr_s1 : " + i + ", arr_s1[" + arr_s1[i] + "]");
        }

        for (int i = 0; i < s2.length(); i++) {
            arr_s2[i] = dupli(s1_pos, i, s1, s2);
            System.out.println("arr_s2 : " + i + ", arr_s2[" + arr_s2[i] + "]");
        }

        int max_s1 = arr_s1[0];
        int max_s2 = arr_s2[0];


        for (int i = 1; i < s1.length(); i++) {
            if (max_s1 < arr_s1[i]) max_s1 = arr_s1[i];
        }
        for (int i = 1; i < s2.length(); i++) {
            if (max_s2 < arr_s2[i]) max_s2 = arr_s2[i];
        }

        if (max_s1 > max_s2) {
            for (int i = 0; i < s1.length(); i++) {
                if (arr_s1[i] == max_s1) {
                    for (int j = i; j <= max_s1; j++) {
                        System.out.print(s1.charAt(j));
                    }
                }
            }
        } else {
            for (int i = 0; i < s2.length(); i++) {
                if (arr_s2[i] == max_s2) {
                    for (int j = i; j <= max_s2; j++) {
                        System.out.print(s2.charAt(j));
                    }
                }
            }
        }
    }
    //System.out.println(s1);
    //System.out.println(s2);


    static int dupli(int s1_pos, int s2_pos, String s1, String s2) {
        int cnt = 0;
        if (s1.charAt(s1_pos) == s2.charAt(s2_pos)) {
            cnt++;
            if (s1_pos == s1.length()-1 || s2_pos == s2.length()-1)
                return cnt;
            return cnt + dupli(++s1_pos, ++s2_pos, s1, s2);
        } else {
            return cnt;
        }
    }
}