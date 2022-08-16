package 평가2차대비;

/*
 * 3. Class 관련 문제 (클래스 다이어그램)
 * 생성자의 매개변수 유무 확인
 * + UNIT : String = "원" ==> public static final String UNIT = "원";
 * - money : into ==> private int money;
 * + Money(money:int) ==> public Money(int money) {};
 */
public class B_TestPassClassEx {
    public static void main(String[] args) {
        B_Money money = new B_Money(10000); // 문제^^
        money.print();
    }
}
