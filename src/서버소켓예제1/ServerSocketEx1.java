package 서버소켓예제1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx1 {
    public static void main(String[] args) throws IOException {
        // ServerSocket 생성하는 방법들
        // 1번째 : 생성자에 Port 번호 대입
        // ServerSocket serverSocket = new ServerSocket(5001);
        // 2번째 : 만들어진 ServerSocket 에 Ip 와 Port 번호 할당해줌
        ServerSocket serverSocket = new ServerSocket();
        try {
//            serverSocket.bind(new InetSocketAddress("39.114.240.95", 62135));
            serverSocket.bind(new InetSocketAddress("localhost", 5508));
            // 만들어진 ServerSocket 에 IP와 Port 번호 연결해줌
            // BindException Error 가 발생하는 경우, 해당 Port 이미 사용중이면 에러 발생
            while (true) { // Client 연결 기다림
                System.out.println("[클라이언트 연결을 기다림...]");
                // Client 연결 요청하기까지 Blocking, 반환값은 열린 Socket 대한 식별자
                Socket socket = serverSocket.accept(); // Client 연결 받기
                /*
                 * 연결된 클라이언트의 IP, Port 번호 확인
                 *getHostName() : Client IP Address
                 * getPort() : Client Port 번호
                 * toString() : "IP : Port 번호" 형태로 문자열 반환
                 */
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락함] " + inetSocketAddress.getHostName());
            }
        } catch (Exception e) {
            if (!serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }
}
