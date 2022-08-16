package 단어공부;

import java.util.Scanner;

public class CountAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가장 많이 등장하는 단어를 찾기위해 알파벳 수 만큼의 배열 생성 (대소문자 구분 안함으로...)
        int[] alpha = new int[26];
        int max = 0;
        char result = 0;
        System.out.print("단어 입력 : ");
        String word = sc.next(); // 스캐너 객체를 이용해 문자열을 입력받음
        // 입력받은 단어의 길이만큼 반복문을 수행하면서 알파벳을 정수로 변환한 인덱스값 누적
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') alpha[word.charAt(i) - 'a']++;
            else alpha[word.charAt(i) -'A']++;
        }

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == max) result = '?'; // 가장 많이 등장하는 수가 여러개인 경우
            else if (alpha[i] > max) { // 현재 인덱스의 문자 개수가 max보다 큰 경우
                max = alpha[i];
                result = (char) ('A' + i); // 결과를 문자로 출력하기위해서 인덱스의 정수값을 문자로 변환
           }
        }
        System.out.println(result);
    }

    public void solveMyself() {
        Scanner sc = new Scanner(System.in);


        String str = sc.next();

        // 알파벳 수 길이만큼 배열 생성
        char[] arr = new char[26];

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            // 소문자면 대문자로 치환
            if (s - 'a' >= 0) {
                s -= ('a' - 'A');
            }
            arr[s - 'A']++;
        }

        int freq = arr[0];
        int pos = 0, cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > freq) {
                freq = arr[i];
                pos = i;
                cnt = 0;
            }
            if (freq == arr[i]) cnt++;
        }

        if (cnt > 0) System.out.println("?");
        else System.out.println((char) (pos + 'A'));
    }
}
