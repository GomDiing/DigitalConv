package 직렬화메뉴읽기;

import 직렬화메뉴쓰기.CoffeeMenuInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

/*
 * 역직렬화 : Byte 로 직렬화된 File 읽어 객체로 변
 */
public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    getMenuList();
}

    static void getMenuList() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/직렬화메뉴쓰기/커피메뉴만들기.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Map<String, CoffeeMenuInfo> map = new HashMap<>();
        map = (Map<String, CoffeeMenuInfo>) objectInputStream.readObject();
        System.out.println("<<역직렬화해서 메뉴 호출>>");

        for (String e : map.keySet()) {
            // get(key) : Key 로 Value 얻음
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGorup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("---------------------");
        }
        fileInputStream.close();
        objectInputStream.close();
    }
}
