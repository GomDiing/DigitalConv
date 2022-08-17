package 람다만들기;

import java.util.Calendar;

/*
 * 화살표 기호를 사용하여 람다 표현식을 작성할 수 있습니다.
 * 매개변수의 타입을 추론할 수 있는 경우 타입을 생략할 수 있음
 * 매개변수가 하나인 경우에는 () 생략할 수 있음
 * 함수의 몸체가 하나의 명령문만으로 이루어진 경우 {} 생략 가능
 * 상속을 주기위한 선언부만 만들 수 있음
 * 함수형 Interface : 참조변수의 타입 참조변수의 이름 = 람다표현식
 */
public class LambdaEx {
    public static void main(String[] args) {
        /*
        MyCalculator myCalculator = new MyCalculator();
        */

        /*
         * Interface 상속받아서 Class 대신 Lambda 식으로 구현
         * (매개변수 목록) -> (a + b);
         * (int a, int b)는 Calculator interface 의 sum Method 의 입력 항목에 해당
         * -> 뒤의 (a + b)는 반환값에 해당
         * Lambda 함수를 이용해서 MyCalculator 같은 실제 Class 없이 객체 생성 가능
         */
        Calculator myCalculator = (int a, int b) -> (a + b);
        int result = myCalculator.sum(10, 30);
        System.out.println(result);
/*

        MyFuncInterface myFuncInterface1 = (x) -> { // method(x)에 대한 구현부가 된다
            System.out.println(x *= x);
        };
*/
        MyFuncInterface myFuncInterface2 = (x, y) -> x < y ? x : y; // 구현부

//        myFuncInterface1.method(5);

        System.out.println(myFuncInterface2.min(3, 4));

    }
}

// 상속을 주기 위한 선언부만 만들 수 있음
interface Calculator {
    int sum(int a, int b);
}

/*
class MyCalculator implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}*/

/*
 * Interface 선언에 해당 Annotation 붙이면 Compiler 는 해당
 * Interface 를 함수형 Interface 로
 * 함수형 Interface 는 한 개의 Method 만 허용
 */

@FunctionalInterface
interface MyFuncInterface {
//    public void method(int x);
    public int min(int x, int y); // 둘 중 작은 값을 반환
}
