package 암호체크만들기;

/*
 * 길이는 10에서 30 사이 (10 <= len() <= 30)
 * 숫자, 대문자, 소문자 포함
 * 특수문자는 ! % + # & + - * / 9개 중 한개가 포함되어야 함
 * 위 조건을 모두 만족하면 "Good password!"
 * 만족하지 않으면 "Bad password!"
 * 사용자가 "quit" 또는 "QUIT"을 입력하면 종료
 */

import java.util.Scanner;

public class PasswordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 암호 체크를 위한 클래스에 대한 객체 생성, 생성자는 기본 생성자
        CheckPWClass checkPW = new CheckPWClass();
        // 사용자가 입력한 패스워드를 저장하기위한 변
        String password;
        while (true) { // 무한 반복, 사용자가 quit할 대가지 무한 반복
            password = sc.next(); // 키보드를 통해서 패스워드 입력받음
            // 입력받은 패스워드가 종료(quit)이면 반복문을 종료함
            if (password.equalsIgnoreCase("quit")) break;
            // 패스워드 체크를위해 입력받은 문자열을 매개변수로 전달하면서 inputPW() 호출
            checkPW.inputPW(password);

        }
    }
}
