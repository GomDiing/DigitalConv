package API클래스;

// java.lang.* : 기본적으로 포함되어있음
// Object 클래스 : 모든 클래스의 최고 조상 클래스
// clone() 메소드 : 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환
// 객체를 복사하는 경우 참조 타입 변수인 경우 필연적으로 얕은 복사가 일어남
// 이런 문제를 해결하기위해 clone()메소드를 사용하며, clone() 메소드는
// 데이터의 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만이 사용할 수 있음

public class ApiMainEx extends Object {
    public static void main(String[] args) throws CloneNotSupportedException {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 30, true);
//        Member mem2 = new Member("fox", "헌터", "65789", 24, false);
//        mem1 = mem2;

        Member mem2 = mem1.getMember();
        mem2.age = 18;
        mem2.name = "테스터";
        System.out.println("이름 : " + mem1.name);
        System.out.println("이름 : " + mem2.name);
        System.out.println("나이 : " + mem1.age);
        System.out.println("나이 : " + mem2.age);



    }
}

