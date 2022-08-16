package 파일입출력스트림2;

import java.io.*;

public class FileOutputImage {
    public static void main(String[] args) throws IOException {
        String originalFileName = "/Users/ryute/Study/Lecture/KHAcademy/DigitalConv/src/파일입출력스트림2/bear.jpeg";
        String targetFileName = "src/파일입출력스트림2/copyBear.jpeg";

        InputStream fileInputStream = new FileInputStream(originalFileName);
        OutputStream fileOutputStream = new FileOutputStream(targetFileName);
        int readByteNo;
        byte[] readBytes = new byte[100]; // 한 번에 100Byte 읽음

        // 읽을 내용이 있는 동안 반복 수행
        while ((readByteNo = fileInputStream.read(readBytes)) != -1) {
            // 파일의 내용을 읽어 시작부터 읽은 크기만큼을 target 파일에 씀
            fileOutputStream.write(readBytes, 0, readByteNo);
        }
        fileOutputStream.flush(); // 출력 Buffer 비우기
        fileOutputStream.close(); // 출력 Stream 자원 반납 및 닫기
        fileInputStream.close(); // 입력 Stream 자원 반납 및 닫가
    }
}
