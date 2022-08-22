package 자바실습3서버;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ServerSend extends Thread{
    Socket socket;

    ArrayList<Socket> sockets = new ArrayList<>();

    String filePath;

    public ServerSend(Socket socket, String filePath) {
        this.socket = socket;
        this.filePath = filePath;
        sockets.add(socket);
    }

    @Override
    public void run() {
        int readBuffer;
        byte[] buffer = new byte[1024];
        OutputStream outputStream;
        FileInputStream fileInputStream;
        try {
            for (int i = 0; i < sockets.size(); i++) {
                fileInputStream = new FileInputStream(filePath);
                outputStream = sockets.get(i).getOutputStream();
                while ((readBuffer = fileInputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, readBuffer);
                }
                outputStream.flush();
                outputStream.close();
            }
        } catch (IOException e) {}
    }
}
