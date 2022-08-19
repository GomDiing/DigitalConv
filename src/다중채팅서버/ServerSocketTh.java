package 다중채팅서버;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

import static java.lang.System.out;

public class ServerSocketTh extends Thread {
    // Socket 식별자 ArrayList 생성
    Socket socket;
    ArrayList<Socket> sockets = new ArrayList<>();
    public ServerSocketTh(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String string;
                // Socket 입력 받음 (Byte 단위)
                InputStream inputStream = socket.getInputStream();
                // 문자 변환 보조 Stream (Byte 입력을 문자로 변환)
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                // Buffer 이용하면 입출력성능 개선됨 (성능 향상 보조 Stream)
                BufferedReader reader = new BufferedReader(inputStreamReader);
                if ((string = reader.readLine()) != null) {
                    System.out.println(string);
                    for (int i = 0; i < sockets.size(); i++) {
                        OutputStream outputStream = sockets.get(i).getOutputStream(); // 쓰기
                        // Text 출력 Stream
                        PrintWriter printWriter = new PrintWriter(outputStream, true);
                        printWriter.println();

                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
