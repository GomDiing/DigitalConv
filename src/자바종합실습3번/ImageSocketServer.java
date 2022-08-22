package 자바종합실습3번;

import 자바종합실습2번.ServerSocketTh;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ImageSocketServer {
    public final static int port = 8605;
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("전송할 파일을 선택 (경로/파일) : ");
        String path = sc.nextLine(); // 전송할 File 대한 Path + FileName

        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept(); // Client 연결 수락
                System.out.println("[Client : " + socket.getRemoteSocketAddress() + " 연결!");
                Thread imageServerTh = new ImageServerTh(socket, path);
                imageServerTh.start();
            }
        } catch (IOException e) {}
    }
}
