package 람다메소드참조;

/*
 * Method 참조 : Method 참조해서 매개변수의 정보 및 반환 타입을 알아내
 * 불필요한 매개변수를 제거하는 것이 목적
 */

import java.util.function.IntBinaryOperator;

class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }

    public int instanceMethod(int x, int y) {
        return x + y;
    }
}

public class LambdaMethodRef {
    public static void main(String[] args) {
        // 두 개의 int 값에 대한 연산 결과로 int 값 형성
        IntBinaryOperator operator;

        // 정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1 : " + operator.applyAsInt(2, 4));

        // 메소드 참조
        operator = Calculator::staticMethod;
        System.out.println("결과 2 : " + operator.applyAsInt(4, 8));

        // 인스턴스 참조
        Calculator calc = new Calculator();
        operator = (x, y) -> calc.instanceMethod(x, y); // 람다식
        System.out.println("결과 3 : " + operator.applyAsInt(8, 16));

        // 인스턴스에대한 메소드 참조
        operator = calc::instanceMethod;
        System.out.println("결과 4 : " + operator.applyAsInt(16, 24));
    }
}
