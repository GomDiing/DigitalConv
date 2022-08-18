package 소켓예제1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * IP 주소 확인
 * DNS 에 대한 IP 주소 확인
 */
public class SocketEx1 {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());

            InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : inetAddresses) {
                System.out.println("www.naver.com IP 주소 : " + remote.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
