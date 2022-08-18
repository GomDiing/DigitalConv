package 서버소켓통신1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientSocketCom1 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5805));
            System.out.println("[연결 성공]");

            byte[] bytes = null;
            String message = null;

            OutputStream outputStream = socket.getOutputStream();
            message = "안녕하세요. 서버님^^";
            bytes = message.getBytes(StandardCharsets.UTF_8);
            outputStream.write(bytes);
            outputStream.flush();
            System.out.println("[데이터 보내기 성공]");

            InputStream inputStream = socket.getInputStream();
            bytes = new byte[100];
            int readByteCount = inputStream.read(bytes);
            message = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("[데이터 받기 성공] : " + message);

            outputStream.close();
            inputStream.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
