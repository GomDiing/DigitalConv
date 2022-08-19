package 단일채팅서버;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReceiveThread extends Thread {
    private final Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream buffer = new DataInputStream(socket.getInputStream());
            while (true) {
                String receiveString = buffer.readUTF();
                if (receiveString == null || receiveString.equalsIgnoreCase("quit")) {
                    System.out.println("상대방 연결이 종료되었습니다.");
                    socket.close();
                    System.exit(0);
                } else {
                    System.out.println("\b" + socket.getInetAddress() + " : " + receiveString);
                    System.out.print(">");
                }
            }
        } catch (IOException e) {
            // e.printStackTrace();
        } finally {
//            System.exit(0);
        }
    }
}
