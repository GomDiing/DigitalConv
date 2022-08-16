package 중첩클래스;

// 하나의 클래스 내부에 선언된 또 다른 클래스를 의미

public class ComplexMain {
    public static void main(String[] args) {
        A a = new A();
        // 내부 객체를 생성하기위해서는 외부 객체를 만들어야함
        A.B b = a.new B();


        // 중첩 클래스 내부에 정적 클래스 호출
        System.out.println(A.C.test);

        A.C.testMethod();
    }
}

class A {
    class B {
        void testMethod() {
            System.out.println("중첩 클래스의 메소드입니다.");
        }
    }
    static class C { // 정적 클래스
        static String test = "test";
        static void testMethod() {
            System.out.println("정적 클래스의 메소드입니다.");
        }
    }
}
