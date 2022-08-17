package 직렬화메뉴쓰기;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeiralMenuWrite {
    // Key(String)와 Value(CoffeMenuInfo)로 구성되는 Map Collection
    static Map<String, CoffeeMenuInfo> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        menuWrite();
        selectMenu();
    }

    static void menuWrite() {
        map.put("Americano", new CoffeeMenuInfo
                ("Americano", 2500, "Coffee", "그냥 커피"));
        map.put("Espresso", new CoffeeMenuInfo
                ("Espresso", 2500, "Coffee", "진한 커피"));
        map.put("Latte", new CoffeeMenuInfo
                ("Latte", 2500, "Coffee", "진한 커피"));
    }

    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key;
        while (true) {
            System.out.print("메뉴를 선택하세요 : ");
            System.out.print("[1]메뉴 보기, [2]메뉴 추가, [3]종료 : ");
            int inputMenu = sc.nextInt();
            switch (inputMenu) {
                case 1:
                    System.out.println("========= 메뉴 보기 =========");
                    // map에서 key 가져와서 향상된 for 수행
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getGorup());
                        System.out.println("설명 : " + map.get(e).getDesc());
                        System.out.println("---------------------");
                    }
                    break;

                case 2:
                    System.out.println("추가 할 메뉴를 입력하세요 : ");
                    key = sc.next(); // key 가 Map 의 Key 이면서 메뉴의 이름
                    if (map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String grp = sc.next();
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.put(key, new CoffeeMenuInfo(key, price, grp, desc));
                    }
                    break;

                case 3:
                    System.out.println("메뉴를 종료합니다. 내용을 파일에 저장합니다");
                    FileOutputStream fileOutputStream = new FileOutputStream("src/직렬화메뉴쓰기/커피메뉴만들기.txt");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(map);
                    objectOutputStream.flush();
                    fileOutputStream.flush();
                    objectOutputStream.close();
                    fileOutputStream.close();
                    return;
            }
        }
    }
}