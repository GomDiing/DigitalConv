package 평가3차시험대비;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 *  문제 해결 시나리오
 *  1. Client 용 Program 작성했으나 서버에 연결되지 않음. 이유를 찾아서 기술 (ClientMain class 참조)
 *  2. IO를 이용하여 기존 파일에 데이터를 이어쓸 수 있도록 구현 (OutputMain class cㅏㅁ조)
 */

/*
 * 서술형
 * 1. 상속에 대해 서술
 * : 부모가 가진 멤버(Filed, Method)를 새로 작성하지 않고 물려받아 자신의 것처럼 사용하는 것
 * 2. 다형성에 대해 서술
 * : 상속을 이용한 기술로 부모 타입으로부터 파생된 여러 가지 타입의 자식 객체를 부모 클래스 타입 하나로 다룰 수 있는 기술
 * 3. 오버라이딩(Overriding)에 대해 서술
 * : 부모 클래스의 메소드를 상속받아 재정의해서 사용하는 것, 이 경우 자식 클래스가 우선
 * 4. 오버로딩(Overloading)과 오버라이딩(Overriding) 차이점 서술
 * : 오버로딩 : 동일 클래스 내의 동일한 메소드 이름을 사용하는 것으로 매개변수의 타입이나 개수가 달라야 한다
 * : 오버라이딩 : 부모 클래스에서 정의되어있는 메소드를 자식 클래스에서 재정의하는 것 (매개변수, 자료형, 개수, 순서가 동일)
 * 5. String Class 주요 메소드 설명
 * : charAt(int index) : 주여진 문자열에서 해당 인덱스의 문자 추출해서 반환한느 메소드
 * : length() : 문자열의 길이를 반환하는 메소드
 * : substring(begin, end) : begin 이상 end 미만까지의 문자열을 추출해서 반환하는 메소
 * : toUpperCase() : 해당 문자열 전부 대문자로 변경
 * : toLowerCase() : 해당 문자열 전부 소문자로 변경
 * 6. String str = "Apple, Kiwi, Strawberry, Banana"; -> Kiwi 문자열 출력 (Six class 참조)
 * 7. Interface 와 Abstract Class 차이점 기술
 * : Abstract Class 는 상속시 Keyword 사용하고 extends 사용하며 단일 상속이다
 * - 1개 이상의 Abstract Method 존재해야하고 일반 Method 포함 가능하다
 * : Interface 는 상속시 implements Keyword 사용하고 다중 상속처럼 사용 가능하다
 * - 기본적으로 모든 Method = Abstract Method 임으로 abstract 생략할 수 있다
 * - 일반 필드를 포함할 수 있지만 Interface 는 상수 필드만 가능함
 * 8. Overriding 성립 요건 5가지 기술
 * : Method 이름 동일, 매개변수 동일, 반환 타입 동일, 접근제한자 동일, 예외처리 개수 동일
 * 9. Wrapper Class 8가지 기술
 * : Boolean, Byte, Character, Short, Integer, Long, Float, Double
 * 10. 문자열 "10"을 int 자료형인 10으로 변환시키기
 * : Integer.parseInt("10"); // 문자열을 정수로 변환
 * 11. 문자열 "13.45"를 double 자료형인 13.45로 변환
 * : Double.parseDouble("13.45");
 * 12. Math Class 의 메소드는 모두 정적 Method 이다
 * : min(num1, num2) : 전달된 2개의 값 중에서 작은 값을 반환
 * : max(num1, num2) : 전달된 2개의 값 중에서 큰 값을 반환
 * : abs(num) : 절달된 값에 대한 절대값 반환
 * : round(num) : 전달된 값에대해 반올림한 결과를 반환
 * : floor(num) : 전달된 수의 버림한 결과를 반환
 * 13. StringTokenizer Class (Thirteen class 참조)
 * : countTokens() : 객체안에 담겨있는 Token 개수를 반환 (꺼내지않고 남아있는 Token 수)
 * : hasMoreTokens() : 남아있는 Token 있는지 확인
 * : nextToken() : 토큰을 하나씩 가져와서 반환
 * 14. 현재 System 날짜 및 시간 가져오기 (Fourteen class 참조)
 * : SimpleDateFormat 클래스 이용 "2022년 08월 22일 15시 45분" 출력
 * 15. 예외처리 관련 문제 : "부적절한 나눗셈을 시도하였습니다." (Fifteen class 참조)
 * : try { } catch {ArithmeticException e) { }
 * 16. 예외처리 관련 문제 (Sixteen class 참조)
 * : ArithmeticException 은 RuntimeException 의 자식 클래스이기 때문에
 * : RuntimeException 에서 다형성 개념이 적용됨으로 가능하다
 * 17. 0으로 나누기 연산시 발생할 수 있는 예외 Class 기술하시오
 * : ArithmeticException
 * 18. 배열에서 부적절한 인덱스로 접근하려할 때 발생할 수 있는 예외 Class 기술
 * : ArrayIndexOutOfBoundsException
 * 19. 배열의 크기를 음수로 지정하는 경우 발생하는 예외 Class 기술
 * : NegativeArraySizeException
 * 20. Collection Framework 중 Set 관련 문제
 * : add (E e) : 전달된 객체를 Set 에 추가하는 메소드
 * : isEmpty() : 해당 Set 이 비어있는지 확인, 비어있으면 true, 그렇지 않으면 false
 * : size() : 해당 Set 에 저장되어있는 개체 수를 반환하는 메소드
 * 21. Map 계열의 Collection Framework 설명 (TwentyOne class 참조)
 * - put(K key, V value) : 전달된 Key 와 Value 를 해당 Map 에 추가시켜주는 메소드
 * - get(K key) : 전달된 Key 대한 객체를 반환해주는 메소드
 * -??? set(K key, V value) : 해당 Map 에 전달된 Key 대한 값 객체를 전달된 값 객체로 변경해주는 메소드 (???)
 * - keySet() : 모든 Key 담아서 Set 객체로 반환
 * - entrySet() : Key 와 Value 의 쌍으로 구성된 모든 Map.entry 객체를 Set 에 담아서 반환
 * 22. List 계열의 Collection Class 메소드 설명 (TwentyTwo class 참조)
 * : add(E e) : 전달된 객체를 List 끝에 추가
 * : set(index, E e) : 해당 인덱스의 값을 전달된 객체로 변경
 * : size() : List 전달된 객체의 수를 반환
 * : remove(index) : 전달된 index 객체를 제거
 * : get(index) : 해당 index 객체 반환
 * 23. Map 담겨있는 요소를 순차접근하기위한 두 가지 방법
 * : keySet(), entrySet()에 대해 기술하고 방법 설명
 * : keySet() : Map 의 key 를 Set 에 담은 후 Set 있는 Iterator 통해 접근
 * : entrySet() : Map 의 Key 와 Value 를 Set 에 담은 후 Set 에 있는 Iterator 통해 접근
 * 24. Java : 배열(Array)와 컬렉션(Collection) 차이점 기술
 * : 배열(Array)은 크기를 지정해야하고 한 번 크기를 정하면 변경할 수 없지만 컬렉션(Collection) 크기는 제약이 없다
 * : 컬렉션은 정렬 및 반복자 등을 제공하여 알고리즘을 구현하는데 필수적인 요소를 제공하고 있다
 * : 배열은 한 가지 타입으로만 구성되지만 컬렉션은 객체등을 통해 다양한 데이터를 포함할 수 있다
 */

public class ClientMain {
    public static void main(String[] args) {
        int port = 3000;
        String serverIP;
        try {
            // 자기 자신의 IP Address이기 때문에 잘못됨 ^^
            serverIP = InetAddress.getLocalHost().getHostAddress();
            System.out.println(serverIP);
            Socket socket = new Socket(serverIP, port);

        } catch (IOException e) {}
    }
}

class OutputMain {
    public static void main(String[] args) {
        FileWriter fileWriter = null; // 문자 기반 Stream 으로 Text Data 를 파일에 저장할 때 사용
        try {
            // true 옵션 추가해야함^^
            fileWriter = new FileWriter("src/평가3차시험대비/test.txt", true);
            fileWriter.write(97);
            fileWriter.write(65);
            fileWriter.close(); // 여기를 유심히 봐야함 ^^
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}

class Six {
    public static void main(String[] args) {
        String str = "Apple, Kiwi, Strawberry, Banana";
        String[] arr = str.split(", ");
        System.out.println(arr[1]);
    }
}

class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 연속 입력 : ");
        String name = sc.nextLine();
        int idx = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(name, "/");
        String[] nameArray = new String[stringTokenizer.countTokens()]; // 꺼내지않고 남아있는 Token 수 ^^
        while (stringTokenizer.hasMoreTokens()) { // 남아있는 Token 있는지 여부 확인
            nameArray[idx++] = stringTokenizer.nextToken();
        }
        for (String s : nameArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

class Fourteen {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 hh시 mm분 ss초");
        String str = sdf.format(today);
        System.out.println(str);
    }
}

class Fifteen {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt(); // 나누어지는 수
            int n2 = sc.nextInt(); // 나눌 수
            System.out.println("두 수의 나눗셈 결과 : " + n1 / n2);
        } catch (ArithmeticException e) {
            System.out.println("부적절한 나눗셈을 시도하였습니다.");
        }
    }
}

class Sixteen {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}

class TwentyOne {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("안유진", 77);
        map.put("이영지", 65);
        map.put("이윤지", 75);
        map.put("미미", 56);

        System.out.println(map.get("안유진"));

        Set<String> keySet = map.keySet(); // 모든 Key 담아 Set 객체로 변환
        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();

        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}

class TwentyTwo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("안유진");
        list.add("이영지");
        list.set(1, "미미");
        list.remove(1);

        for (String e : list) {
            System.out.println(e + " ");
        }
    }
}

class TwentyThree {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }
    }
}