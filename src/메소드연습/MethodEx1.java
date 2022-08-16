package 메소드연습;

// Java의 Class는 멤버로 속성을 표현하는 필드와 기능을 표현하는 메소드를 가짐
// 메소드는 반복되는 코드를 하나의 기능으로 만들어 중복 구현을 방지
// 기능을 모듈화해서 가독성을 높임
// 문제점을 발견하거나 수정이 간편하다
// 가급적 하나의 메소드는 하나의 기능만 수행하도록 구현한

import com.sun.security.jgss.GSSUtil;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println(whileSum(10));
        System.out.println(forSum(10));
        System.out.println(gausSum(10));
        System.out.println(recuSum(10));
//        System.out.println(MethodEx1.whileSum(10));
//        System.out.println(MethodEx1.forSum(10));
//        System.out.println(MethodEx1.gausSum(10));
//        System.out.println(MethodEx1.recuSum(10));

    }
    // 메소드 camel 표기법을 따르면 첫자가 소문자
    // 접근제한자 반환타입 메소드 이름 (매개변수 목록) { }
    // 반환타입은 해당 메소드를 호출되면 수행 후 결과를 반환하는 타입을 의미한다
    // 반환 타입과 return 키워드 이후의 값의 타입이 일채해야한다
    // 반환 타입이 정수이고 매개변수가 2개인 경우

    public int sum(int a, int b) {
        return a+b;
    }

    public void test() {
        System.out.println("Test 메소드를 호출했습니다.");
    }

    // 클래스 메소드이다
    public static int whileSum(int n) {
        int sum = 0;
        while (true) {
            sum += n;
            n--;
            if (n == 0) break;
        }
        return sum;
    }

    public static int forSum(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
    return sum;
    }

    public static int gausSum(int n) {
        return n * (n + 1) / 2;
    }

    public static int recuSum(int n) {
        if (n == 0) return 0;
        return n + recuSum(n-1);
    }
}
