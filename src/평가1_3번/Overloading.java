package 평가1_3번;
/*
 * 메소드 오버로딩 : 동일한 메소드 이름으로 매개변수 타입이나 개수에 따라 다양하게 호출
 * 즉, 동일한 이름의 메소드가 여러개 존재함을 의미
 * 매개변수나 타입이같고 반환값만 다른 경우에는 성립하지 않는다
 */

public class Overloading {
    public void test() {}
    public void test(String str) {}
    public void test(int i) {} // 타입이 다르기때문에 가능
    // public void test(String s) {} // 매개변수의 갯수와 타입이 같아서 안
    public void test(char ch) {}
    // 인자의 개수와 타입이 같지만 순서가 다르면 오버로딩 가능
    public void test(String str, int i) {}
    public void test(int i, String str) {}
    // 이미 동일한 개수와 타입이 있음
    // public void test(int ii);
    // 매개변수가 없는 void test()가 있어서 반환값만 달라선 오버로딩이 되지 않는다.
    // public int test() {return 0;};

}
