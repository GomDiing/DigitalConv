package 단일채팅서버;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread{
    private final Socket socket;
    private Scanner sc = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 기본 데이터 타입으로 입출력이 가능
            DataOutputStream sendWriter = new DataOutputStream(socket.getOutputStream());
            String sendString;
            while (true) {
                System.out.print(">");
                sendString = sc.nextLine();
                // UTF-8 인코딩을 사용해서 문자열 출력,
                sendWriter.writeUTF(sendString);
                sendWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
