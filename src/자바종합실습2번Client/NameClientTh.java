package 자바종합실습2번Client;

import 자바종합실습2번.NameCardS;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameClientTh extends Thread {
    Socket socket;

    public NameClientTh(Socket socket) {
        this.socket = socket;
    }

    void viewNameCard(List<NameCardS> nameCardS) {
        for (NameCardS card : nameCardS) {
            System.out.println("===== 명함 정보 출력 ======");
            System.out.println("이름 : " + card.getName());
            System.out.println("회사 : " + card.getCompany());
            System.out.println("전화번호 : " + card.getPhone());
            System.out.println("이메일 : " + card.getEmail());
        }
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        List<NameCardS> nameCardS = null;

        try {
            while (true) {
                inputStream = socket.getInputStream();
                objectInputStream = new ObjectInputStream(inputStream);
                nameCardS = (List<NameCardS>) objectInputStream.readObject();
                viewNameCard(nameCardS);
            }
        } catch (EOFException e) {
            System.out.println("<< 명함 수신이 완료되었습니다. 작업을 종료합니다.");
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }
}
