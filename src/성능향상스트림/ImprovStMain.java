package 성능향상스트림;

import 파일입출력스트림2.FileOutputImage;

import java.io.*;

public class ImprovStMain {
    public static void main(String[] args) throws IOException {
        long start = 0, end = 0; // 시간 측정을 위한 변수 (ms 단위)
        int data = -1; // 읽은 데이터가 있는지 확인하는 변수
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        fileInputStream = new FileInputStream("/Users/ryute/Study/Lecture/KHAcademy/DigitalConv/src/파일입출력스트림2/bear.jpeg");
        bufferedInputStream = new BufferedInputStream(fileInputStream);
        fileOutputStream = new FileOutputStream("src/성능향상스트림/copyBear.jpeg");
        start = System.currentTimeMillis();
        while ((data = bufferedInputStream.read()) != -1) {
            fileOutputStream.write(data);
        }

        fileOutputStream.flush();
        end = System.currentTimeMillis();
        fileOutputStream.close();
        bufferedInputStream.close();
        fileInputStream.close();

        System.out.println("버퍼를 사용하지 않았을 때 " + (end - start) + "ms");

        fileInputStream = new FileInputStream("/Users/ryute/Study/Lecture/KHAcademy/DigitalConv/src/파일입출력스트림2/bear.jpeg");
        bufferedInputStream = new BufferedInputStream(fileInputStream);
        fileOutputStream = new FileOutputStream("src/성능향상스트림/copyBear.jpeg");
        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        start = System.currentTimeMillis();
        while ((data = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(data);
        }

        bufferedOutputStream.flush();
        end = System.currentTimeMillis();
        fileOutputStream.close();
        bufferedInputStream.close();
        fileInputStream.close();

        System.out.println("버퍼를 사용했을 때 : " + (end - start) + "ms");
    }
}
