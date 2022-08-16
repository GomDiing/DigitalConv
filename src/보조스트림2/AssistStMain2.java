package 보조스트림2;

/*
 * OutputStreamWriter() : 바이트 출력 Stream 을 문자 출력 Stream 으로 변
 */

import java.io.*;

public class AssistStMain2 {
    public static void main(String[] args) throws IOException {
        // Byte 출력 Stream
        OutputStream fileOutputStream = new FileOutputStream("src/보조스트림2/file.txt");
        // 문자 출력 Stream
        Writer writer = new OutputStreamWriter(fileOutputStream, "UTF-8");
        String data = "하루에 3시간을 걸으면 7년 후에 지구를 한바뀌 돌 수 있다.";
        writer.write(data);
        writer.flush();
        writer.close();

    }
}
