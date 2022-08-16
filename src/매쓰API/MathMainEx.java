package 매쓰API;

/*
 * Math 클래스 : 수학에서 자주 사용하는 메소드를 모아둔 것
 * static 메소등ㅁ으로 객체 생성없이 사용가능
 * random() : 0.0 ~ 1.0 미만 임의의 double형 값을 생성하여 반환
 * abs() : 절대값 구하기 (전달된 값이 음수이면 양수로, 양수면 그대로 양수)
 * floor() : 소수점 이하를 무조건 버림
 * ceil() : 소수점 이하를 무조건 올림
 * round() : 소수점 첫째 자리에서 반올림
 * max() : 전달된 두 값을 비교하여 큰 값을 반환
 * min() : 전달된 두 값을 비교하여 작은 값을 반혼
 */

public class MathMainEx {
    public static void main(String[] args) {
        // 0 ~ 45까지의 46개의 랜덤값을 생성한 후 1을 더해줌 (1 ~ 46)
        int lotto = (int)(Math.random() * 46) + 1;
        int val1 = (int)(Math.random() * 6); // 0 ~ 5 까지 6개의 랜덤값
        int val2 = (int)(Math.random() * 6) + 1; // 1 ~ 6까지의 랜덤값
        int val3 = (int)(Math.random() * 6) + 3; // 3 ~ 8까지

        System.out.println(lotto);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

        System.out.println(Math.abs(10));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.000000001));
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.99999999));
        System.out.println(Math.round(10.51));
        System.out.println(Math.round(10.49999999));
        System.out.println(Math.round(10.50000000));

        System.out.println("MAX : " + Math.max(1.444, 1.4555));
        System.out.println("MAX : " + Math.max(1, 11));
        System.out.println("MAX : " + Math.max('a', 'A'));

        System.out.println("MIN : " + Math.min(1.444, 1.4555));
        System.out.println("MIN : " + Math.min(1, 11));
        System.out.println("MIN : " + Math.min('a', 'A'));
    }
}
