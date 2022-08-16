package ArrayEx1;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
/*
        */
/*
        배열 선언 방식 1
        int[] score = new int[3];   // score 이름으로 3개의 정수 타입 배열을 생성
        score[0] = 88;
        score[1] = 70;
        score[2] = 66;
        *//*


        // 배열 선언 방식 2
        int[] score = {89, 99, 108, 77};

        int sum = 0;

        */
/*
        기존 for 문
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + " ");
            sum += score[i];
        *//*


        */
/*
        // 향상된 for 문 : 자동으로 요소의 처음부터 끝까지 순 (원하는 위치부터 순회 불가)
        for (int e : score) {
            e += 100;
            System.out.printf("%4d", e);
            sum += e;
            }
        System.out.println();
        *//*


        // 위 for 문과 비교시 e+=100이 아래 e에 영향을 미치지않는다.
        for (int e : score) {
        //    System.out.printf("%4d", e);
            sum += e;
            }

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double)sum/score.length);
*/
        int[] adds = {1,3,5,6,9,11};
//        String[] weeks = {"월요일", "화요일", "수요일", "목요일", "금요일"};

        String[] weeks = new String[7];
        weeks[0] = "월요일";
        weeks[1] = "화요일";
        weeks[2] = "수요일";
        weeks[3] = "목요일";
        weeks[4] = "금요일";
        weeks[5] = "토요일";
        weeks[6] = "일요일";

        System.out.print("[");


        // for 문
        for (int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + ", ");
        }

//      향상된 for 문
        for (String e : weeks) {
            System.out.print(e + ", ");
        }

        System.out.printf("\b\b]");
        System.out.println();

        System.out.println(Arrays.toString(weeks));
    }
}
