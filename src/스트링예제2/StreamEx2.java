package 스트링예제2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream 은 Collection 요소에 대해 중간 처리와 최종 처리를 수행할 수 있는데
 *
 * 반복, 카운팅, 평균, 총합 등의 처리를 수행
 */
public class StreamEx2 {
    public static void main(String[] args) {
        List<StudentInfo> list = new LinkedList<>();
        list.add(new StudentInfo("미미", 45));
        list.add(new StudentInfo("안유진", 98));
        list.add(new StudentInfo("이영지", 88));
        list.add(new StudentInfo("이은지", 90));
        list.add(new StudentInfo("나영석", 91));

        // 1. 향상된 for 문
        /*
        for (StudentInfo e : list) {
            String name = e.getName();
            int score = e.getScore();
            System.out.println(name + ", " + score);
        }
        */

        // 2.
        // 순차처리
        /*
        Stream<StudentInfo> stream = list.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            print(String.format(name + ", " + score));
        });
        // 병렬처리
        Stream<StudentInfo> parallelStream = list.parallelStream();
        parallelStream.forEach( s -> {
            String name = s.getName();
            int score = s.getScore();
            print(String.format(name + ", " + score));
        });
        */

        // 중간 스트림 만들기
        double avg = list.stream()
                .mapToDouble(StudentInfo::getScore) // Method 참조
//                .mapToDouble(() -> StudentInfo.getScore()) // Method 참조
                .average()
                .getAsDouble();
        System.out.println("평균점수 : " + avg);
    }

    static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}

class StudentInfo {
    private String name;
    private int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
