package 자바종합실습3번Client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ImageClientTh extends Thread{
    Socket socket;
    String path;

    public ImageClientTh(Socket socket, String path) {
        this.socket = socket;
        this.path = path;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            int len; // 수신받은 Byte 길이
            byte[] buffer = new byte[1024]; // 한 번에 수신받은 Buffer 크긱
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);

            }
            System.out.println("이미지 전송 완료 !!!");
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
