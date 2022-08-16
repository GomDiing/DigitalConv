package 바이트입력스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * InputStream : Byte 기반 입력 Stream 최상위 추상 Class
 * 자식으로는 FileInputStream, BufferInputStream, DataInputStream
 */
public class ByteInputStEx {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/바이트출력스트림/test0816.txt");
        /* 1Byte 씩 읽기
        while (true) {
            int data = is.read(); // Stream 부터 1Byte 읽음 (Return Type : int)

            if (data == -1) break; // 더 이상 읽을 데이터가 없다
            System.out.println(data);
        }
        */

        // 배열의 길이만큼 읽기
        /*
        byte[] buffer = new byte[100];
        while (true) {
            int readByteNum = is.read(buffer); // Array 길이(100)만큼 읽음
            if (readByteNum == -1) break; // 파일 끝... 더 이상 읽을 Data 없음

            for (int i = 0; i < readByteNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        */

        byte[] buffer = new byte[5];
        // readByteNum 은 inputStream 에 존재하는 값을 읽음 (3)
        // is.read : inputStream 존재하는 Byte 값들을 buffer 에 압력
        // 단, buffer 에 값을 저장할때 2번 index 부터 3개의 값 저장 (즉, 0, 0, 10, 20, 30)
        int readByteNum = is.read(buffer, 2, 3);
        if (readByteNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }

        if (is != null) is.close(); // 열린 InputStream 닫음
    }
}
