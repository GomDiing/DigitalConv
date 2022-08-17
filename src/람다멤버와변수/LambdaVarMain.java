package 람다멤버와변수;

/*
 * Lambda 식에서 Class 멤버 (Field / Method)와 로컬 Variable 사용하기
 *
 */

@FunctionalInterface
interface MyFuncInterface {
    public void method();
}

class UsingThis {
    public int outterField = 10;
    class Inner {
        int innerField = 10;
        void method() {
            int localVal = 30; // 지역 Variable 은 final 특성을 가진다
            MyFuncInterface mi = () -> {
                System.out.println("외부 필드 : " + outterField);
                System.out.println("외부 필드 : " + UsingThis.this.outterField);
                System.out.println("내부 필드 : " + innerField);
                System.out.println("내부 필드 : " + this.innerField);
                System.out.println("지역 변수 : " + localVal);
            };
            mi.method();
        }
    }
}

public class LambdaVarMain {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
