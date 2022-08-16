package 예외처리던지기;

/*
 * 원하는 조건에서 필요한 경우 예외 객체를 생성시키면서 예외를 발생시킬 수 있음
 */
public class ExceptionThrowEx {
    public static void main(String[] args) {
        ThrowEx ex = new ThrowEx();
        ex.printStr(5);
    }
}
