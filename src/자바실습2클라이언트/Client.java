package 자바실습2클라이언트;

import java.net.Socket;
import java.util.Scanner;

public class Client {

    final static int port = 5805;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", port);
            System.out.println("서버 접속 성공");
//            Thread sendThread = new ClientSend(socket);
            Thread receiveThread = new ClientReceive(socket);
//            sendThread.start();
            receiveThread.start();

        } catch (Exception e) {
            System.out.println("서버 접속 실패!!!");
        }
    }
}
