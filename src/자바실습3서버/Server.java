package 자바실습3서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    final static int port = 8506;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("전송할 파일을 입력하세요 (경로/파일명) : ");
        String filePath = sc.next();

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("IP : " + socket.getInetAddress() + " 와 연결되었습니다");
                Thread sendThread = new ServerSend(socket, filePath);
                sendThread.start();
            }

        } catch (IOException e) {}
    }
}
