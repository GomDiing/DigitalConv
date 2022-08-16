package 보조스트림;

import java.io.*;

/*
 * AssistStream : 기본 Stream 에 보조 Stream 연결해서 사
 * 목적은 입/출력 빈도를 줄여 성능 향상, 데이터 형식 변환 등에 사용
 * 보조 스트림 참조변수 = new 보조스트림(기본 스트림)
 * InputStreamReader() [문자 변환 보조 스트림] : Byte Stream 과 문자 Stream 연결할 수 있도록 해줌
 */
public class AssistStMain {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = new FileInputStream("src/문자출력스트림/문자출력0816_01.txt");
        InputStream inputStream = System.in; // 시스템 입력으로부터 바이트 스트림으로 입력 받음
        // InputStreamReader() : 기본 인코딩을 사용하는 객체 생
        Reader reader = new InputStreamReader(inputStream, "UTF-8");
        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = reader.read(cbuf)) != -1) {
            String data = new String(cbuf, 0, readCharNo);
            System.out.println(data);
        }
        reader.close();
    }
}
