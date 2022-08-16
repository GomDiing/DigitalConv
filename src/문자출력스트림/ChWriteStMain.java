package 문자출력스트림;
/*
 * Writer : 문자열 기반 출력 Strean 최상위 추상 Class
 * 모든 문자 기반 출력 Stream Class 들은 이 Class 상속받아 만들어진다
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ChWriteStMain {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("src/문자출력스트림/문자출력0816_01.txt");
        // char[] data = "곰돌이사육사".toCharArray(); // 문자열(String)을 문자 배열(Character Array)로 변환

        /* == writer.write(data);
        for (int i = 0; i < data.length; i++) {
            writer.write(data[i]); // 해당 index 를 write
        }
        */

        String data = "내일은 내일의 태양이 뜬다.";
        writer.write(data); // String Type 대한 Overloading Method 존재

        // writer.write(data); // write(char[]);

        writer.flush(); // 입력 이후는 Buffer 비워야함
        writer.close(); // 입력 이후 자원 반납하고 열려있는 Stream 닫음
    }
}
