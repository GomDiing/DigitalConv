package 평가2차대비;

import java.util.Scanner;

/*
 * 1. 반복문
 * for() : 반복횟수가 정해져있을 때 주로 사용
 * while() : 반복횟수가 정해져있지않을 때 주로 사용
 * do ~ while() : 무조건 한번은 수행되는 반복문 (조건식이 마지막에 있음)
 * 반복여부를 결정하는 조건식이 맨 아래에 존재
 * 2. 무한 반복문 while에서 1부터 10까지만 출력할 수 있는 방법을 제시하시오
 * 단, while문에서 while(true) 유지하면 만점
 * 3. 문자열 배열을 만들어서 "사과", "딸기", "오렌지"로 초기화
 * 4. 구구단 출력 문제 : 2단만 출력 (싱글 for문 사용)
 * 5. 패스
 * 6. 문자열 출력하기
 * 7. 배열의 얕은 복사, 깊은 복사를 설명하시오.
 * - 얕은 복사란? 참조 변수 사용시 변수에 값이 복사가 되지않고 주소가 복사되는 것을 의미
 * - 깊은 복사란? 값이 복사
 * 8. 배열의 깊은 복사를 할 수 있는 방법 3가지
 * - for, arraycopy, copyOf
 * 9. 배열의 특징 2가지
 * (같은 데이터 타입, 크기 변경 불가능, 여러개의 값을 연속으로 저장할 수 있다)
 * - 같은 타입으로 이뤄진 유한의 데이터를 저장하는 공간
 * 10. int 자료형을 10개 담을 수 있는 공간 iArr을 생성하시오
 * 11. double 자료형 5개 담을 수 있는 dArr 생성
 * 12, 13. 어떤 값을 출력되는 묻는 문제 : 주소값이 출력, 0이 출력
 * - String 참조변수에 아무것도 대입되지 않으면 null (참조형에서 주소가 할당되어있지 않을때)
 * - 객체를 만들고 아무것도 대입하지 않으면 이것도 null
 * - null을 참조하는 객체를 호출하면 NullPointerException 에러 발생
 * 14. 배열을 for문으로 출력하는 문제
 * 15. 클래스 변수와 인스턴스 변수의 초기화 순서
 *  - 클래스 변ㅅ : JVM이 정한 기본값 -> 명시적 초기화 -> 초기화 블록
 *  - 인스턴스 변수 : JVM이 정한 기본값 -> 명시적 초기화 -> 초기화 블록 -> 매개변수 생성자
 *  - 클래스 변수 : 클래스 생성시 초기화
 *  - 인스턴스 변수 : 객체 생성시 생성자를 통해 초기화
 * 16. getter/setter 작성 문제
 * 17. 접근제한자의 접근 가능 범위에대해 기술하시오.
 * - private : 클래스 내에서만 접근 가능 (클래스 내부의 메소드를 통해 필드 접근)
 * - default : (키워드 없음) 동일 패키지 내에서 접근 가능
 * - protected : 동일 패키지 내에서 접근 가능, 다른 패키지이더라도 상속 관계면 접근가능
 * - public : 모든 패키지에서 접근 가능
 * 18. 필드에 들어갈 수 있는 접근제한자를 기술하시오
 * - (private, default, protected, public)
 * - 필드란? 클래스 내부에서 사용되는 변수를 의미함
 * 19. 메소드에 들어갈 수 있는 접근제한자 기술
 * - private, default, protected, public
 * - 메소드란? 클래스 내부에서 사용되는 하나의 기능을 구현한 것
 * - 메소드란? 필드에 대해 값을 쓰거나 읽는 동작을 위해 사용되기도 함 (getter/setter)
 * 20. 객체 지향 프로그램의 3대 측징에 대해 쓰시오
 * - 상속, 다형성, 캡슐화(데이터 은닉), 추상화
 * 21. Java에서 클래스 변수, 인스턴스 변수, 지역 변수의 특징에 대해서 기술
 *  - 클래스 변수 : static 선언된 필드(멤버) 변수, 클래스에 소속되고 객체로 만들어지지 않는다.
 *  ㄴ 프로그램 정적 메모리 영역에 할당되고 종료시 소멸된다.
 *  - 인스턴스 변수 : new에 의해서 객체로 만들어지는 변수, this 참조 변수로 접근 가능
 *  - 지역 변수 : 메소드 또는 제어문 내에서 선언된 변수를 의미하고 stack 영역에 생성됨
 *  - 해당 메소드나 제어문을 벗어나면 자동 소멸된다.
 * 22. 메소드 오버로딩에대해 설명하시오
 *  - 동일한 메소드 이름을 사용하고, 매개변수의 타입이나 개수로 메소드를 자동으로 호출함
 *  - 키워드 (동일한 메소드 이름이어야하고, 매개변수는 달라야하며, 반환 타입으론 결정되지 않는다)
 * 23. public class 클래스명{}, class 클래스명 {} 차이가 뭔지 설명
 *  - 클래스명에는 접근제한자 public이거나, 없거나 둘 중 하나만 존재함
 *  - public이 붙어있으면 해당 파일의 주인이 된다. 다른 패키지에서 import해서 사용가능
 *  - public이 없으면 해당 패키지 안에있는 클래스끼리만 사용가능
 *  - 왜냐면 import 할 수 없기에
 * 24. 클래스에 들어갈 수 있는 접근제한자 기술 (public, default)
 */
public class C_TestPassMainEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int i = 0;

        /* 1-1
        for (i = 0; i < age; i++) {
            System.out.print("입력받은 나이에대한 범위를 출력합니다");
        }*/

        /* 1-2
        while (true) {
            i++;
            System.out.println("입력 받은 나이의 범위 : " + i);
            if (i ==age) break;
        }
        */

        /* 1-3
        do {
            i++;
            System.out.println("입력받은 나이의 범위 : " + i);
        } while (i < age);
        */

        /* 2
        while (true) {
            i++;
            System.out.print(i + " ");
            if (i >= 10) break;
        }
        */

        /* 3
         * 첫번째 방법 : 선언과 동시에 문자열 대입
         * String[] fruit = {"사과", "딸기", "오렌지"};
         * 두번째 방법 : 선언 이후 값을 대입
        String[] fruit = new String[5];
        fruit[0] = "사과";
        fruit[1] = "딸기";
        fruit[2] = "오렌지";
        */

        /* 4
        for (int j = 1; j < 10; j++) {
            System.out.println(2 + "*" + i + "=" + (2*i));
        }
        */

        /*

        String[] fruit = {"수박", "포도", "딸기"};
        // for (String e : fruit) System.out.print(e + " ");
        for (i = 0; i < fruit.length; i++) {
            System.out.print(fruit[i] + " ");
        }

         */

        /* 10-11
        int[] iArr = new int[10]'
        double[] dArr = new double[5];
         */

        /* 12
        int[] iArr = new int[10];
        System.out.println(iArr); // 참조 변수는 값이 없고 주소값을 가진다
        System.out.println(iArr[5]); // 0이 출력된다.
        */
       /*

        String[] sArr = new String[3];
        System.out.println(sArr); // 주소값이 출력된다.
        System.out.println(sArr[0]); // null
        */

        //14
        /*
        int[] iArr = {1, 2, 3, 4, 5};
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }
        */

        MemberInfo memberInfo = new MemberInfo("GV80");
        memberInfo.setMemberId("1004");
        System.out.println(memberInfo.getMemberId());

        System.out.println(MemberInfo.company);
    }
}

class MemberInfo {
    private String memberId; // 인스턴스 필드를 생성하고 접근제한함
    // getter는 접근제한자가 public
    // 일반적으로 인스턴스 필드의 값을 반환함
    public String getMemberId() {
        return memberId; // 헤딩 인스턴스 필드값을 반환
    }

    // setter는 일반적으로 반환값이 없고, 매개변수로 값을 전달받음
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    // 21
    static String company = "현대자동차";
    String modelName; // 인스턴스 변수 또는 인스턴스 필드라고 부름

    public MemberInfo(String modelName) {
        this.modelName = modelName;
    }
}
