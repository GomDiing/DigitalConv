package 자바종합실습1번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TextFieldRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null; // 가리키고있는 주소가 없다
        // TreeSet : Binary Tree 생성시 자동정령 특성을 가짐 (Comparable 기준으로)
        TreeSet<StudentInfo> treeSet = new TreeSet<>();
        try {
            // FileInputStream : InputStream 자식이며 Byte 로 File 에서 Data 읽음
            fileInputStream = new FileInputStream("src/자바종합실습1번/score.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        // Scanner 입력은 Console 이외의 File 부터로도 읽어들일 수 있음
        Scanner sc = new Scanner(fileInputStream);

        while (sc.hasNextLine()) { // 읽어들일 다음 Line 있는지 검사
            String line = sc.nextLine(); // 개행문자 (Enter 키) 기준으로 읽음
            String[] stringArray = line.split(" ");
            treeSet.add(new StudentInfo(stringArray[0],
                    Integer.parseInt(stringArray[1]),
                    Integer.parseInt(stringArray[2]),
                    Integer.parseInt(stringArray[3])));
        }

        for (StudentInfo studentInfo : treeSet) {
            System.out.println(studentInfo.getName() + " : " + studentInfo.getTotal());
        }
    }
}
