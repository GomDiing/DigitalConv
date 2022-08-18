package 서버소켓에제1;

/*
 * Client 는 연결 요청을 함
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocketEx1 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket(); // Connection 위한 Socket 생성
            System.out.println("[연결 요청]");
//            socket.connect(new InetSocketAddress("39.114.240.95", 62133));
            socket.connect(new InetSocketAddress("localhost", 5508));
            System.out.println("[연결 성공]");
        } catch (Exception e) {
        }
        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (Exception e1) {}
        }
    }
}
