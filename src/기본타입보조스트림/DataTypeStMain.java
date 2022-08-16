package 기본타입보조스트림;

import java.io.*;

/*
 * Byte Stream 은 Byte 단위로 입출력하기에 Java의 기본 타입 단위로 입출력할 수 없음.
 * DataInutStream / DataOutputStream 통해 연결해서 사용
 */
public class DataTypeStMain {
    public static void main(String[] args) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("src/기본타입보조스트림/primitive.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF("우영우");
        dataOutputStream.writeDouble(95.5);
        dataOutputStream.writeInt(1);

        dataOutputStream.writeUTF("동그라미");
        dataOutputStream.writeDouble(92.5);
        dataOutputStream.writeInt(2);

        dataOutputStream.flush();

        FileInputStream fileInputStream = new FileInputStream("src/기본타입보조스트림/primitive.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        String name;
        double score;
        int order;

        name = dataInputStream.readUTF();
        score = dataInputStream.readDouble();
        order = dataInputStream.readInt();
        System.out.println(name + " : " + score + " : " + order);

        name = dataInputStream.readUTF();
        score = dataInputStream.readDouble();
        order = dataInputStream.readInt();
        System.out.println(name + " : " + score + " : " + order);

        dataInputStream.close();

    }
}
