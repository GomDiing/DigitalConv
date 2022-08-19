package 다중채팅서버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiReceive extends Thread {
    Socket socket;

    public MultiReceive(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream; // Binary 입력
        InputStreamReader inputStreamReader; // Birnay -> Charset 변환 Stream
        BufferedReader bufferedReader; // 성능 향상 보조 Stream
        String string = null;
        try {
            while (true) {
                inputStream = socket.getInputStream(); // Socket 에서 Binary 입력
                inputStreamReader = new InputStreamReader(inputStream); // Binary -> Charset 변환
                bufferedReader = new BufferedReader(inputStreamReader); // 성능 향상 보조 Stream
                if ((string = bufferedReader.readLine()) != null) {
                    System.out.println(string);
                }
            }
        } catch (IOException io) {}
    }
}
