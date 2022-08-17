package 콘솔입출력;

import java.io.IOException;
import java.io.OutputStream;

/*
 * 키보드 입력을 받고 화면에 출력하는 것
 * System.in , System.out , System.err
 * System.in 필드 : 콘솔로부터 데이터를 입력받음, InputStream 과 사용 가능
 * System.out 필드 : 데이터를 출력하기위해 사
 */
public class ConsoleInPutMain {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;

        for (byte b = 48; b < 58;b++) {
            outputStream.write(b);
        }

        outputStream.write(10);

        for (byte b = 65; b < 65 + 26; b++) {
            outputStream.write(b);
        }

        outputStream.write(10);

        String hangul = "가나다라마바사아자차카타파하";
        byte[] hangulBytes = hangul.getBytes();
        outputStream.write(hangulBytes);
        outputStream.flush();
    }
}
