package 해시맵;

/*
 * 해시맵이란? 키(key)와 값(value)로 구성된 자료 구조
 * 해시는 검색과 저장에 아주 우수한 성능을 가집니다.
 * 해시코드? Heap 영역에 저장된 인스턴스에 대한 참조값
 * 해시함수? 고정된 길이를 가진 데이터(배열?)로 매핑해주는 함수
 * 해시충돌? 해시테이블에 중복으로 값이 저장되는 경우
 * 이 경우 체이닝 기법 등을 사용합니다. (충돌된 값끼리 Linked List로 연결)
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMainEx1 {
    public static void main(String[] args) {
        // Map 컬렉션 생성 : Map<Key, Value> map
        // = new HashMap<Key, Value (생략 가능)>();
        Map<String, Integer> map = new HashMap<>();
        // 객체에 값 추가 : put(Key, Value)
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("이준호", 80);
        map.put("권민우", 93);
        // Map은 Key에 대한 중복허용을 하지 않기때문에, 후위 값을 대체된다
        map.put("동그라미", 80);
        System.out.println("총 Entry 수 : " + map.size());
        // 객체 찾기
        System.out.println(map.get("동그라미"));
        // keySet() : 모든 Key를 Set 객체에 담아서 반환함
        // Iterator를 이용해 값을 읽어오는 방법
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) { // 다음 요소가 있는지 확인
            String key = iterator.next(); // 다음 요소의 key를 가져옴
            Integer value = map.get(key); // key로 value를 읽어옴
            System.out.println("키 : " + key);
            System.out.println("값 : " + value);
        }
        System.out.println();

        // 향상된 for문 사용
        for (String e : map.keySet()) { // Map.Entry에서 Key를 추출해 Set에 담음
            System.out.println("Key : " + e);
            System.out.println("Value : " + map.get(e)); // Key를 넣어서 Value를 반환받음
        }

        // 객체 삭제 : remove(Key), Key로 해당 Map.Entry 제거
        map.remove("권민우");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        // 객체 수정 : replace(Key, Value)
        map.replace("이준호", 91);

        // Key와같이 쌍으로 구성된 Map.Entry
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key : " + key);
            System.out.println("Value : " + value);
        }
        System.out.println();


    }
}
