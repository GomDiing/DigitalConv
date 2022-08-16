package 예외처리던지기;

public class ThrowEx {
    String str = null; // str이라는 참조변수가 아무것도 가리키고 있지 않다는 의미
//    String str = ""; // 실제 문자열이 존재하지만 빈 문자열이라는 의미
    public void printStr(int cnt) {
        if (str == null) {
            System.out.println("str이 null이다.");
            throw new NullPointerException(); // 디버깅을 위해서
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println("출력 : " + str);
        }
    }
}
