package 입력테스트;

/*
 * HashSet : 순서를 유지하지않고, 중복허용을 하지않음
 * 집합의 기능 사용 : 교집합, 합집합, 차집합
 * 교집합 : 양쪽에 있는 모든 요소를 포함함 (중복허용 하지않음)
 * 합집합 : 양쪽 모두에 존재하는 요소만 포함 (중복허용 하지않음)
 * 차집합 : 앞의 집합에서 뒤의 집합을 제외 (?)
 */

import java.util.Arrays;
import java.util.HashSet;

public class SetCollection {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        // s1.addAll(s2); // 합집합 수행
        // s1.retainAll(s2); // 교집합
        // s1.removeAll(s2); // 차집합
        // System.out.println(s1);
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Kotlin");
        // 여러개 값 한번에 추가
        set.addAll(Arrays.asList("JavaScript", "C++", "C#" ));
        set.remove("C#");
        // 여러개 값 한번에 제거
        set.removeAll(Arrays.asList("JavaScript", "C++", "C#"));
        System.out.println(set);
    }
}
