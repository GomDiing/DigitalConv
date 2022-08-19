package 단일채팅클라이언트;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public class ReceiveThread extends Thread {
    private final Socket socket;
    private String receiveString;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream buffer = new DataInputStream(socket.getInputStream());
            while (true) {
                try {
                    receiveString = buffer.readUTF();
                    if (receiveString == null) {
                        System.out.println("상대방 연결이 종료되었습니다.");
                        socket.close();
                        System.exit(0);
                    } else {
                        System.out.println("\b" + socket.getLocalAddress() + " : " + receiveString);
                        System.out.print(">");
                    }
                } catch (EOFException e) {
                    System.out.println("상대방 연결이 종료되었습니다.");
                    socket.close();
                    System.exit(0);
                    break;
                }
            }
        } catch (IOException e) {
            // e.printStackTrace();
        } finally {
//            System.exit(0);
        }

    }
}
