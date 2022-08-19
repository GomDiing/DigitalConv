package 다중채팅서버;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.System.out;

public class MultiSend extends Thread {
    Socket socket;
    String name;
    Scanner sc;

    public MultiSend(Socket socket, String name) {
        sc = new Scanner(System.in);
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                OutputStream outputStream = socket.getOutputStream();
                // true 넣으면 자동 flush 됨으로 별도 flush 호출 생략
                PrintWriter printWriter = new PrintWriter(outputStream, true);
                // 출력을 콘솔 출력과 동일하게 사용 가능
                printWriter.println(name + " : " + sc.nextLine());
            }
        } catch (IOException e) {}
    }
}
