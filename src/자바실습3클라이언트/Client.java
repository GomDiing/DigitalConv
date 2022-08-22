package 자바실습3클라이언트;

import java.net.Socket;
import java.util.Scanner;

public class Client {
    final static int port = 8506;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", port);
            System.out.println("서버 접속 성공");
            System.out.print("저장할 위치를 지정하시오 (경로/파일명) : ");
            String filePath = sc.nextLine();
            Thread receiveThread = new ClientReceive(socket, filePath);
            receiveThread.start();

        } catch (Exception e) {
            System.out.println("서버 접속 실패!!!");
        }
    }
}
