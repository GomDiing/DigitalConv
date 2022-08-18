package 서버소켓통신1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerSocketCom1 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null; // ServerSocket 참조 변수 생성
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 5805));
            while (true) {
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept();
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락] " + inetSocketAddress.getHostName());

                byte[] bytes = null;
                String message = null;

                OutputStream outputStream = socket.getOutputStream();
                message = "안녕하세요. 클라이언트님^^";
                bytes = message.getBytes(StandardCharsets.UTF_8);
                outputStream.write(bytes);
                outputStream.flush();
                System.out.println("[데이터 보내기 성공]");

                InputStream inputStream = socket.getInputStream();
//                bytes = new byte[100];
                bytes = new byte[inputStream.available()];
                int readByteCount = inputStream.read(bytes);
                message = new String(bytes, 0, readByteCount, "UTF-8");
                System.out.println("[데이터 받기 성공] : " + message);

                outputStream.close();
                inputStream.close();
            }
        } catch (BindException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
