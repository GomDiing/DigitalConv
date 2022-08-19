package 단일채팅클라이언트;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SingleChatClient {
    public static void main(String[] args) throws IOException {
        login();
        Socket socket = new Socket("localhost", 5805);
        System.out.println("서버와 연결되었습니다.");
        ReceiveThread receiveThread = new ReceiveThread(socket);
        receiveThread.start();
        SendThread sendThread = new SendThread(socket);
        sendThread.start();
    }

    static void login() {
        LoginInfo loginInfo = LoginInfo.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        loginInfo.setId(sc.next());
//        System.out.print("비밀번호를 입력하세요 : ");
//        loginInfo.setPassword(sc.next());
    }
}
