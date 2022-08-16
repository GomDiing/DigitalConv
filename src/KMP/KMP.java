package KMP;

import java.util.Scanner;

/*
 * "Knuth-Morris-Pratt" 형태로 첫글자는 항상 대문자, 그리고 성과 성 사이는 '-'으로 이어짐
 *  결과는 성씨의 첫글자인 대문자만 표시, 그리고 하이픈 뒤에는 반드시 대문자이다.
 *  입력은 한 줄로 이루저여있고 100글자 이내의 영어 대문자/소문자로 이뤄짐
 */
public class KMP {
    public static void main(String[] args) {
        /*
         * 문자열 입력을 받기 위한 Scanner 객체 생성
         * 문자열 입력을 대한 가이드 문구 출력
         * 문자열 입력 받기
         * 입력 받은 문자열 길이만큼 반복문 수행
         * 첫번째 방법 : charAt(인덱스)로 문자의 ASCII 확인 후 'A' ~ 'Z' 사이 문자만 출력
         * 두번째 방법 : 0번째 문자 출력, 그리고 '-' 다음의 문자 출력
         * 세번째 방법 : split() 메소드로 자르고 각장 0번째 인덱스
         * 네번째 방법 : 배열로 변경 후 'A' ~ 'Z' 사이 문자만 출력
         */
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
//        String shortName = "";
        String resultName = "";
        String shortName = Character.toString(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == '-') {
                char s = name.charAt(i + 1);
                if (s - 'a' > 0) s -= 'a' - 'A';
                shortName += s;
            }
        }

        // String : shorName에 저장된 문자를 다 대문자로 변환
        for (int i = 0; i < shortName.length(); i++) {
            char s = shortName.charAt(i);
            if (s - 'a' > 0) s -= 'a' - 'A';
            resultName += s;
        }

        resurtionSplit(name);
        changeArray(name);

        System.out.println(shortName);
        System.out.println(resultName);

    }

    public static void resurtionSplit(String name) {
        String[] splitName = name.split("-");
        for (String s : splitName) {
            System.out.print(s.charAt(0));
        }
    }

    public static void changeArray(String name) {
        char[] chName = name.toCharArray();
        for (char e : chName) {
            if (e >= 'A' && e <= 'Z')
                System.out.print(e);
        }
        System.out.println();
    }

}
