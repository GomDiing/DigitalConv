package 조건문;
//if(조건식) {수행할 문장}

import java.util.Scanner;

public class IfExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("정수를 입력 : ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("양수입니다.");
        }
        else {
            System.out.println("음수입니다.");
        }
        */
        System.out.println("문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);   //문자열에서 0번째 문자를 추
        if (ch >= 'a' && ch <= 'z') {   // 문자는 내부적으로 ascii(unicode)값으로 판단함
            System.out.println("입력하신 알파벳은 소문자입니다.");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("입력하신 알파벳은 대문자입니다.");
        }
        else {
            System.out.println("알파벳이 아닙니다.");
        }
    }
}
