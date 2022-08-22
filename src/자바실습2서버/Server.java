package 자바실습2서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    final static int port = 5805;

    public static void main(String[] args) {
        List<CompanyInfo> companyInfo = new ArrayList<>();
        writeCompanyInfo(companyInfo);
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("IP : " + socket.getInetAddress() + " 와 연결되었습니다");
                Thread serverThread = new ServerSend(socket, companyInfo);
                serverThread.start();
            }
        } catch (IOException io) {
        }
    }

    public static void writeCompanyInfo(List<CompanyInfo> companyInfo) {
        companyInfo.add(new CompanyInfo("김민준", "010-9926-0526", "교보문고", "kmj0526@gmail.com"));
        companyInfo.add(new CompanyInfo("이서연", "010-4180-1663", "동부화재", "lsy1663@gmail.com"));
        companyInfo.add(new CompanyInfo("박서준", "010-8108-3747", "SK하이닉스", "psj3747@gmail.com"));
        companyInfo.add(new CompanyInfo("이서윤", "010-3407-5559", "인텔", "lsy5559@gmail.com"));
        companyInfo.add(new CompanyInfo("서도윤", "010-0270-4210", "KT", "sdy4210@gmail.com"));
        companyInfo.add(new CompanyInfo("김지우", "010-0049-8866", "현대모터스", "kjw8866@gmail.com"));
        companyInfo.add(new CompanyInfo("오하준", "010-5518-8167", "풀무원", "ohj8167@gmail.com"));
        companyInfo.add(new CompanyInfo("나하윤", "010-7100-4008", "GS", "nhy4008@gmail.com"));
        companyInfo.add(new CompanyInfo("마지호", "010-1082-3377", "농협", "mjh3377@gmail.com"));
        companyInfo.add(new CompanyInfo("차하윤", "010-7817-5226", "현대", "chy5226@gmail.com"));
    }
}
