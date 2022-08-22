package 자바실습3클라이언트;

import 자바실습2서버.CompanyInfo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class ClientReceive extends Thread {
    Socket socket;
    String filePath;

    public ClientReceive(Socket socket, String filePath) {
        this.socket = socket;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        try {
            int readBuffer;
            byte[] buffer = new byte[1024];
            fileOutputStream = new FileOutputStream(filePath);
            inputStream = socket.getInputStream();

            while ((readBuffer = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, readBuffer);
            }
            System.out.println("이미지 수신 완료");
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
