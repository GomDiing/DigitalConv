package 스트링최종연산;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Stream 에서 중간연산을통해 변환된 Stream 은 마지막으로 최종 연산을 통해 소모하여 결과 표시
 * 최종연산을 수행하면 모든 요소가 소모되어 해당 Stream 사용할 수 없습니다.
 * Optional<T> : Class 사용하면 NullPointerException 방지할 수 있도록 해줌
 * ifPresent() : null 상태를 확인하며 if문 대신에 사용
 * forEach() : 요소를 순회하면서 결과를 출력
 * reduce() : 1번째와 2번재 요소를 가지고 연산을 수행한 뒤, 그 결과와 3번째 요소를 가지고 다시 연산을 수행
 * findFirst(), findAny() : 해당 Stream 에서 1번째 요소를 참조하는 Optional 객체 반환
 * findFirst() : 병렬 처리가 안됨, 병렬처리시 1번재 요소를 가져오기위해서는 findAny() 사용
 * anyMatch() : 해당 Stream '일부' 요소가 특정 조건을 만족할 경우 true 반환
 * allMatch() : 해당 Stream '모든' 요소가 특정 조건을 만족할 경우 true 반환
 * count() : Stream 요소 총 개수를 long 타입의 값으로 반환
 * max(), min() : 각각 큰 값, 작은 값 반환
 */
public class StreamFinalEx {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("이은지", "이영지", "미미", "안유진");
        Stream<String> stream2 = Stream.of("이은지", "이영지", "미미", "안유진");
//        stream1.forEach(s -> System.out.print(s + " "));
//        System.out.println();
        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "+" + s2);
        result1.ifPresent(System.out::println);

        String result2 = stream2.reduce("시작", (s1, s2) -> s1 + "+" + s2);
        System.out.println(result2);

        IntStream stream3 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream4 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        OptionalInt result3 = stream3.sorted().findFirst();
        OptionalInt result4 = stream4.sorted().findAny();
        System.out.println(result3.getAsInt());
        System.out.println(result4.getAsInt());

        IntStream stream5 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream6 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        System.out.println(stream5.anyMatch(n -> n > 5));
        System.out.println(stream6.allMatch(n -> n > 0));

        IntStream stream7 = IntStream.of(40, 20, 70, 30, 50, 10, 60);
        IntStream stream8 = IntStream.of(40, 20, 70, 30, 50, 10, 60);
        System.out.println(stream7.count());
//        System.out.println(stream8.max().getAsInt());
        System.out.println(stream8.min().getAsInt());

        IntStream stream9 = IntStream.of(30, 60, 90, 98);
        DoubleStream stream10 = DoubleStream.of(30.33, 90.99, 88.43, 32.08);
        System.out.println(stream9.sum());
        System.out.println(stream10.average().getAsDouble());
    }
}
