package 자바종합실습2번;

/*
 * 이름, 전화번호, 회사명, 이메일이 포함된 10개의 명함 정보 생성 후 다른 컴퓨터로 전송하기
 * 접속된 Client 개수에 상관없이 모든 Client 전송하기
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NameCardServer {
    static List<NameCardS> list = new ArrayList<>(); // 객체를 저장할 ArrayList 생성
    public final static int port = 8509;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                // Client 의 Connect 연결 요청에 대하는 중
                Socket socket = serverSocket.accept();
                System.out.println("[Client : " + socket.getRemoteSocketAddress() + " 연결!");
                ServerSocketTh serverSocketTh = new ServerSocketTh(socket);
                serverSocketTh.start();
            }

        } catch (IOException e) {}
    }

    static List<NameCardS> createNameCardS() {
        list.add(new NameCardS("김민준", "010-9926-0526", "교보문고", "kmj0526@gmail.com"));
        list.add(new NameCardS("이서연", "010-4180-1663", "동부화재", "lsy1663@gmail.com"));
        list.add(new NameCardS("박서준", "010-8108-3747", "SK하이닉스", "psj3747@gmail.com"));
        list.add(new NameCardS("이서윤", "010-3407-5559", "인텔", "lsy5559@gmail.com"));
        list.add(new NameCardS("서도윤", "010-0270-4210", "KT", "sdy4210@gmail.com"));
        list.add(new NameCardS("김지우", "010-0049-8866", "현대모터스", "kjw8866@gmail.com"));
        list.add(new NameCardS("오하준", "010-5518-8167", "풀무원", "ohj8167@gmail.com"));
        list.add(new NameCardS("나하윤", "010-7100-4008", "GS", "nhy4008@gmail.com"));
        list.add(new NameCardS("마지호", "010-1082-3377", "농협", "mjh3377@gmail.com"));
        list.add(new NameCardS("차하윤", "010-7817-5226", "현대", "chy5226@gmail.com"));
        list.add(new NameCardS("김민준", "010-9926-0526", "교보문고", "kmj0526@gmail.com"));
        list.add(new NameCardS("이서연", "010-4180-1663", "동부화재", "lsy1663@gmail.com"));
        list.add(new NameCardS("박서준", "010-8108-3747", "SK하이닉스", "psj3747@gmail.com"));
        list.add(new NameCardS("이서윤", "010-3407-5559", "인텔", "lsy5559@gmail.com"));
        list.add(new NameCardS("서도윤", "010-0270-4210", "KT", "sdy4210@gmail.com"));
        list.add(new NameCardS("김지우", "010-0049-8866", "현대모터스", "kjw8866@gmail.com"));
        list.add(new NameCardS("오하준", "010-5518-8167", "풀무원", "ohj8167@gmail.com"));
        list.add(new NameCardS("나하윤", "010-7100-4008", "GS", "nhy4008@gmail.com"));
        list.add(new NameCardS("마지호", "010-1082-3377", "농협", "mjh3377@gmail.com"));
        list.add(new NameCardS("차하윤", "010-7817-5226", "현대", "chy5226@gmail.com"));

        return list;
    }
}
