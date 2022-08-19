package 자바실습2클라이언트;

import 자바실습2서버.CompanyInfo;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ClientReceive extends Thread {
    Socket socket;

    public ClientReceive(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream;
        try {
            while (true) {
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                List<CompanyInfo> list = (List<CompanyInfo>) objectInputStream.readObject();
                for (CompanyInfo info : list) {
                    System.out.println(info.getName());
                    System.out.println(info.getCompany());
                    System.out.println(info.getEmail());
                    System.out.println(info.getNumber());
                }
            }
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
