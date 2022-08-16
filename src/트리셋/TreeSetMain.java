package 트리셋;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet : 값이 추가될 때 자동 정렬이 이루어지
 * 이진 검색 트리이며 데이터의 추가/제거의 기본 동작이 매우 빠르다
 * 좌/우 노드를 참조하기위한 두 개의 참조변수로 구성됨
 */
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);
        ts.add(45);

        // 향상된 for문
        for (Integer e : ts) System.out.print(e + " ");
        ts.remove(40); // 값 삭제
        System.out.println(ts.size()); // 노드 개수

        //Iterator() 사용
        /*
        Iterator<Integer> iterator = ts.iterator();
        System.out.print("1번 반복자 : ");
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");

        System.out.println();
        Iterator<Integer> iterator2 = ts.iterator();
        System.out.print("2번 반복자 : ");
        while (iterator2.hasNext()) System.out.print(iterator2.next() + " ");
        */
    }
}
