package 대소문자변경;

import java.util.Scanner;

/**
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
 * 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오
 */

public class StringEx1 {
    public static void main(String[] args) {
        /*
         * String을 입력받기 위한 Scanner 객체 발생
         * String 변수에 Scanner를 통해서 String 입력 받기
         * String 배열을 생성 후 입력받은 String을 Char 배열로 변경
         * 반복문을 순회하면서 대문자 / 소문자로 변경
         * 문자 비교는 배열과 'a' ??
         */
        Scanner sc = new Scanner(System.in);

        String sentence = sc.next();
        char[] sentenceChar = sentence.toCharArray();
        for (int i = 0; i < sentenceChar.length; i++) {
            if ((sentenceChar[i] - 'a') > 0) {
                sentenceChar[i] = (char) (sentenceChar[i] - ('a' - 'A'));
            }
            else {
                //sentenceChar[i] = (char) (sentenceChar[i] + '0'-16);
                sentenceChar[i] = (char) (sentenceChar[i] + ('a' - 'A'));
                //System.out.println((char) ('0' - 16));
            }

        }
            System.out.println(sentenceChar);
    }
}
