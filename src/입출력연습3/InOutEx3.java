package 입출력연습3;

import java.io.IOException;

public class InOutEx3 {
    public static void main(String[] args) throws IOException {
        while (true) {
            int keyCode = System.in.read();
            System.out.println("입력받은 문자 : " + keyCode);
            if (keyCode == 'q') break;
        }
    }
}
