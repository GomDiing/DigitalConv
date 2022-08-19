package 자바실습2서버;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread {
    Socket socket;

    ArrayList<Socket> sockets = new ArrayList<>();

    List<CompanyInfo> companyInfo;

    public ServerThread(Socket socket, List<CompanyInfo> companyInfo) {
        this.socket = socket;
        sockets.add(socket);
        this.companyInfo = companyInfo;
    }

    @Override
    public void run() {
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            for (int i = 0; i < sockets.size(); i++) {
                outputStream = sockets.get(i).getOutputStream();
                objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(companyInfo);
                objectOutputStream.flush();
                outputStream.flush();
            }
        } catch (IOException io) {}
    }
}
