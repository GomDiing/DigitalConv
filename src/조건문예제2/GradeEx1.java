package 조건문예제2;
// 시험 성적을 입력받아서 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D
// 나머지는 F
// 입력 받은 시험성적이 0~100 사이가 아니면 "성적이 잘못 입력되었습니다."

import java.util.Scanner;

public class GradeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade >100 || grade <0) System.out.println("성적 잘못 입력되었습니다.");
        else if (grade >= 90) System.out.println("A");
        else if (grade >= 80) System.out.println("B");
        else if (grade >= 70) System.out.println("C");
        else if (grade >= 60) System.out.println("D");
        else System.out.println("F");

        /*
        grade = grade / 10;

        switch (grade) {
            case (9):
                System.out.println("A");
                break;
            case (8):
                System.out.println("B");
                break;
            case (7):
                System.out.println("C");
                break;
            case (6):
                System.out.println("D");
                break;
            default :
                System.out.println("F");
                break;
        }
        */
    }
}
