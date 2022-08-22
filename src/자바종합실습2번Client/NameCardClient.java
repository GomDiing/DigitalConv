package 자바종합실습2번Client;

import 자바종합실습2번.NameCardServer;

import java.io.IOException;
import java.net.Socket;

public class NameCardClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", NameCardServer.port);
            NameClientTh nameClientTh = new NameClientTh(socket);
            nameClientTh.start();
        } catch (IOException e) {}
    }
}
