package 문자열입력스트림;

/*
 * Reader : 문자 기반 입력 최상위 추상 Class
 * 모든 문자 기반 입력 Stream 이 Class 상속받아 만들어짐
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ChReadStMain {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/문자출력스트림/문자출력0816_01.txt");
        /*
        int readData;
        while (true) {
            readData = reader.read(); // 입력 Stream 에서 문자(2Byte)를 읽고 int type 반환
            if (readData == -1) break; // 더 이상 읽을 내용이 없음
            System.out.println((char)readData);
        }
        */

        int readCharNo; // 읽을 문자의 개수
        char[] cbuf = new char[10]; // 문자 배열을 통해 한번에 10개씩 읽음
        String data = ""; // 초기화 방법 중 하나, 가리키는 주소에 문자열이 없음
        while (true) {
            readCharNo = reader.read(cbuf); // 배열의 크기 만큼 읽음
            if (readCharNo == -1) break; // 읽을 문자가 없음을 의미
            data += new String(cbuf, 0, readCharNo); // 시작(0)부터 읽은 문자의 개수만
        }

        System.out.println(data);
        reader.close(); // 문자를 읽기위한 입력 Stream 닫음
    }
}
