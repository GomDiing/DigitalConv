package 다중채팅서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer {
    public static void main(String[] args) {
        int port = 5805;
        try {
            /*
             * port 번호만 넣으면 Server 첫번째 IP 자동 입력
             * Binding 과정 생략
             */
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                // 하나의 Session, 즉 1개의 연결 통로가 만들어짐
                Socket socket = serverSocket.accept();
                Thread serverThread = new ServerSocketTh(socket);
                serverThread.start();
            }
        } catch (IOException e) {}
    }
}
