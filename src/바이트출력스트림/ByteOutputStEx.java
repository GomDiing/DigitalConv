package 바이트출력스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * Byte 단위로 데이터를 전송, 주로 파일(동영상, 이미지 등등) 전송에 사용
 * 최상위 추상 Class : OutputStream
 * FileOutputStream : OutputStream 추상 Class 자손이며 파일 출력
 */
public class ByteOutputStEx {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("src/바이트출력스트림/test0816_01.txt");
        //"/Users/ryute/Study/Lecture/test0816.txt"
        /* 01
        byte a = 10; // Java 기본 Type 중 제일 작다
        byte b = 20;
        byte c = 30;
        */

        byte[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        /*
        outputStream.write(a); // 주어진 값을 출력 (어디로? 파일에다가)
        outputStream.write(b);
        outputStream.write(c);
        */
        /* 02
        outputStream.write(array);
        */
        outputStream.write(array, 1, 3);

        outputStream.flush(); // 남아있는 Buffer 내용 모두 비우기
        outputStream.close(); // File 쓰기위해 열은 Stream 자원을 반납하고 닫음
    }
}
