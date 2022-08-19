package 단일채팅클라이언트;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class SendThread extends Thread {
    private final Socket socket;
    Scanner sc = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    LoginInfo loginInfo = LoginInfo.getInstance();

    @Override
    public void run() {
        try {
            DataOutputStream sendWriter = new DataOutputStream(socket.getOutputStream());
            String sendString;
            while (true) {
                System.out.print("> [" + loginInfo.getId() + "] : ");
                sendString = sc.nextLine();
                try {
                    // UTF-8 인코딩을 사용해서 문자열 출력,
                    sendWriter.writeUTF(sendString);
                    sendWriter.flush();
                } catch (SocketException e) {
                    System.out.println("소켓 연결이 종료되었습니다.");
                    if (socket != null) {
                        socket.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
