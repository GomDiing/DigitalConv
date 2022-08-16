package 사용자정의예외;

/*
 * 사용자 정의 예외 클래스 만들기
 */
public class CustomExMain {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
        int num1 = 100;
        int num2 = 99;

        try {
            System.out.println(ce.printEven(num1));
            System.out.println(ce.printEven(num2));
        } catch (EventException e) {
            e.printStackTrace();
        }
    }
}
