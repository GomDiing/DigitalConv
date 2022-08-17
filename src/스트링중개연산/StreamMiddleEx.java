package 스트링중개연산;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Stream 중개 연산은 Stream 을 전달받아 중개 연산을 연속해서 사용
 * 필터링 : filter(), distinct()
 * 변환 : map(), flatMap()
 * 제한 : limit(), skip()
 * 정렬 : sorted()
 */
public class StreamMiddleEx {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        // Stream 중복 요소 제거
        // distinct() : Stream 중복 요소 제거하는 중간 단계 Stream
        stream1.distinct().forEach(e -> System.out.print(e + " "));
        System.out.println();
        // filter() : 조건을 통해 원하는 것만 골라내는 중간 단계 Stream
        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
        // map() : 해당 Stream 요소들을 주어진 함수에 인수로 전달하여 그 값으로 새로운 Stream 반환
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream.map(s -> s.length()).forEach(e -> System.out.println(e));
        // limit() : 1번째 요소로부터 전달된 개수만큼의 요소만으로 이루어진 새로운 Stream 반환
        // skip() : 1번째 요소로부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 새로운 Stream 반환
        IntStream stream3 = IntStream.range(0, 10); // 0 이상 10 미만
        IntStream stream4 = IntStream.range(0, 10); // 0 이상 10 미만
        IntStream stream5 = IntStream.range(0, 10); // 0 이상 10 미만
        stream3.limit(5).forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream4.skip(4).forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream5.skip(3).limit(5).forEach(s -> System.out.print(s + " "));
        System.out.println();

        // Stream 정렬 : 주어진 비교자(Comparator) 이용해 정렬
        Stream<String> stream6 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream7 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream6.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream7.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
