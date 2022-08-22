package 자바종합실습2번;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerSocketTh extends Thread {
    Socket socket; // Client 연결에 대한 Socket 식별자
    ArrayList<Socket> sockets = new ArrayList<>(); // 개별 Socket Connection 저장

    public ServerSocketTh(Socket socket) { // Client 개수만큼 생성자 호출
        this.socket = socket;
        sockets.add(socket);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < sockets.size(); i++) {
                OutputStream outputStream = sockets.get(i).getOutputStream();
                // 직렬화를 위함 Stream
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                // 생성된 ArrayList 객체 넘겨줌
                objectOutputStream.writeObject(NameCardServer.createNameCardS());
                objectOutputStream.flush(); // Buffer 비우기
                objectOutputStream.close(); // 해당 Stream 종료
                System.out.println(sockets.get(i).getRemoteSocketAddress() + "에게 전송 완료");
                outputStream.close();
            }
        } catch (IOException e) {}
    }
}
