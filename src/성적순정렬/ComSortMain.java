package 성적순정렬;

/*
 * 학생의 이름과 성적을 저장하고 성적이 높은 사람 순으로 정렬
 * 이름과 성적은 5명의 데이터를 임의의 값으로 입력함.
 */

import java.util.Iterator;
import java.util.TreeSet;

public class ComSortMain {
    public static void main(String[] args) {
        /*
         * 정렬은 TreeSet 자동 정렬 특성을 이용해 구현
         * TreeSet : Tree 구성될 때 루트값 기준으로 큰지 작은지 비교하여 자동 정렬
         * 큰지 작은지의 비교 조건은 Comparable 상속받아 구현한 compareTo Method 결정
         */
        TreeSet<StudentInfo> info = new TreeSet<>(); // TreeSet 객체 생성
        info.add(new StudentInfo("우영우", 95));
        info.add(new StudentInfo("동그라미", 65));
        info.add(new StudentInfo("이준호", 77));
        info.add(new StudentInfo("최수연", 88));
        info.add(new StudentInfo("정명석", 97));

        // Iterator 생성 : Iterator 는 Collection + Set
        Iterator<StudentInfo> iterator = info.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name + "");
        }
    }
}
