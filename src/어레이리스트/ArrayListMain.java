package 어레이리스트;

/*
 * 배열의 확장판, Java에서 List 구조의 Collection Framework의 기본 자료 구
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        String[] data = {"124", "138", "145", "155"};

        List<String> pitches = new ArrayList<>();
        // Arrays.asList(배열) : 이미 만들어져있는 배열로 ArrayList를 만듬
        List<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        List<String> pitches3 = new ArrayList<>(Arrays.asList("124", "138", "145", "155"));
        // join() : 구분자를 이용해 문자열을 만들어 줌
        String result = String.join("^^", pitches2);
        System.out.println(result);
        // 리스트 정렬하기, 오름차순 : Comparator.naturalOrder()
        pitches2.sort(Comparator.naturalOrder());
        System.out.println(pitches2);
        // 리스트 정렬하기, 내림차순 : Comparator.reverseOrder()
        pitches2.sort(Comparator.reverseOrder());
        System.out.println(pitches2);
        

        // 리스트에 값 추가
        pitches.add("127");
        pitches.add("142");
        pitches.add("155");
        // 리스트의 해당 인덱스에 값을 삽입
        pitches.add(0, "130");
        // 특정 위치의 값을 가져올대, get(인덱스)
        System.out.println(pitches.get(1));
        // 리스트의 사이즈 확인
        System.out.println(pitches.size());
        // 리스트내에 해당 항목이 있는지 확인 (결가는 참/거짓 으로 변환), contains(확인하고자 하는 값)
        System.out.println(pitches.contains("142"));
        // 해당 인덱스의 항목을 삭제, remove(dㅣㄴ덱스), 삭제되는 결과를 반환해줌
        System.out.println(pitches.remove(0));

        String val1 = pitches.get(0); // 해당 인덱스의 값을 받아 저장

    }
}
