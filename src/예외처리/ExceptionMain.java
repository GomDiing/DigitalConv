package 예외처리;

import java.io.*;
import java.util.Scanner;

/*
 * 예외처리란? 프로그램에서 예외 상황이 발생했을 경우 프로그램의 갑작스러운 종료를 막고
 * 정상적인 똥작을 유지하도록 만들어줌
 */
public class ExceptionMain {
    public static void main(String[] args) {
        FileWriter f = null; // 참조 변수에 초기값 대입
        try {
            f = new FileWriter("test.txt");
            f.write("Hello Java");
        } catch (IOException e) {
            e.printStackTrace(); // 디버깅용으로 사용하며 에러에대한 CallStack 저장

        // 어떤 상황이 발생하더라도 반드시 실행되어야할 구문이 있으면 finally에 기입
        } finally {
            if (f != null) {
                try {
                    f.close(); // 쓰기 위한 파일을 열고 난 다음 다 사용한 후 자원 반납하고 진행
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
