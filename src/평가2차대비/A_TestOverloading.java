package 평가2차대비;

public class A_TestOverloading {
    public void sumTest() {}
    public void sumTest(String str) {} // 매개변수 유무에따라 오버로딩 성립
    public void sumTest(int i) {} // 매개변수의 타입이 다름으로 성립
//    public void sumTest(String s) {} // 오버로딩 성립안함. 매개변수 타입과 개수가 같음
    public void sumTest(int i, String s) {} // 매개변수의 개수가 다름으로 성립
//    public void sumTest(int num) {} // 오버로딩 성립 안함, 타입과 개수가 같음
//    private void sumTest(int i) {} // 접근제한자는 의미 없음, 타입과 개수가 같음, 성립 안함
//    public int sumTest() {return 0;} // 반환형이 다른 건 의미없음, 매개변수가 없는 메소드 의미 있음

}

