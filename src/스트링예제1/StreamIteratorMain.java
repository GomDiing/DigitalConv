package 스트링예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream?
 * Collection Framework 의 저장요소를 하나씩 참조해서 Lambda 처리
 * 다양한 데이터를 표준화된 방법으로 다루기 위한 것
 * 내부 반복자 사용
 * 단, 한번만 사용 가능, 원본 데이터 변경하지 않음, 병렬처리에 장점이 있음
 * forEach() : Stream 요소에대한 순차접근 (Iterator 유사)
 *
 */
public class StreamIteratorMain {

    public static void main(String[] args) {
        String[] name = {"이은지", "이영지", "미미", "안유진"};
        List<String> list = new ArrayList<>(Arrays.asList(name));
        // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // 향상된 for 문
        for (String e : list) System.out.print(e + " ");

        System.out.println();
        // Steram 이용
        Stream<String> stream = list.stream();
//        stream.forEach(s -> System.out.println(s + " "));
        stream.forEach(System.out::print);
    }
}
