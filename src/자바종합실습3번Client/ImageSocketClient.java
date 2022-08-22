package 자바종합실습3번Client;

import 자바종합실습3번.ImageSocketServer;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ImageSocketClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", ImageSocketServer.port);
            System.out.println("서버 접속 성공!");
            System.out.print("저장할 위치 지정 (경로/파일명) : ");
            String path = sc.nextLine();
            Thread imageClientTh = new ImageClientTh(socket, path);
            imageClientTh.start();
        } catch (IOException e) {}
    }
}
