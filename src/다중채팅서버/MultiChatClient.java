package 다중채팅서버;

import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5805);
            System.out.println("서버 접속 성공");
            Scanner sc = new Scanner(System.in);
            System.out.println("이름을 설정하세요 : ");
            Thread sendThread = new MultiSend(socket, sc.nextLine());
            Thread receiveThread = new MultiReceive(socket);
            sendThread.start();
            receiveThread.start();

        } catch (Exception e) {
            System.out.println("서버 접속 실패!!!");
        }
    }
}
