package 인터페이스2;

import 인터페이스2.NetworkAdapter;

import java.util.Scanner;

public class NetworkMain2 {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크를 선택[1]LAN, [2]WiFi, [3]5G : ");
        int num = sc.nextInt();

        switch (num) {
            case 1 :
                adapter = new LAN("KT Mega Pass", "우영우");
                adapter.connect();
                ((LAN)adapter).sendMsg();
                ((LAN)adapter).rcvMsg();
                break;
            case 2 :
                adapter = new WiFi("SK Telecom WiFi", "이준호");
                adapter.connect();
                ((WiFi)adapter).sendMsg();
                ((WiFi)adapter).rcvMsg();
                break;
            case 3 :
                adapter = new FiveG("LG U+");
                adapter.connect();
                break;
            default :
                System.out.println("네트워크 선택이 잘못 되었습니다.");
        }
    }
}
