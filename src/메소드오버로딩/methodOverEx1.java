package 메소드오버로딩;

public class methodOverEx1 {
    // 메소드오버로딩이란?
    // 동일한 메소드를 여러개 정의를하고 매개변수와 개수와 타입에 따라
    // 다양하게 호출
    // 매개변수가 같고 반환타입만 다른 경우는 안된다
    public static void main(String[] args) {
        System.out.println(sum(10,20,30));
        System.out.println(sum(10.00, 20.0, 30));
        System.out.println(sum("seoul", "korea", "gangam"));
    }

    static int sum(int x, int y, int z) {
        System.out.println("정수 정수 정수 메소드 호출");
        return x + y + z;
    }

    static double sum(double x, double y, int z) {
        System.out.println("더블 더블 정수 메소드 호출");
        return x + y + z;
    }
    // 매개변수가 같고 반환형만 다른 경우는 안된다
    /*
    static String sum(double x, double y, int z) {
        System.out.println("더블 더블 정수 메소드 호출");
        return Double.toString(x+y+z);
    }
    */

    static String sum(String x, String y, String z) {
        System.out.println("문자열 문자열 문자열 메소드 호출");
        return x + y + z;
    }
}
