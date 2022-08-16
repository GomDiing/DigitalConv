package 게터와세터;

/*
 * 데이터은닉 특성때문에 나온 개념
 * Getter : 인스턴스 필드의 값을 읽기 위한 메소드
 * Setter : 인스턴스 필드의 값을 쓰기 위한 메소드
 * 필요한 이유는 인스턴스 필드에 대한 외부 접근에 대한 허용을 막아야하기 때문?
 */

import 게임만들기.TestTV;

public class GetSetMain {
    public static void main(String[] args) {
        String[] rateStr = {"", "AUTO", "16:9", "4:3"};
        TestTV testTV = new TestTV(false, 11, 20, 1);
        System.out.println("전원 : " + testTV.isPower());
        System.out.println("채널 : " + testTV.getChannel());
        System.out.println("볼륨 : " + testTV.getVolume());
        System.out.println("비율 : " + rateStr[testTV.getScreenRate()]);
        // 클래스 메소드
        //System.out.println("제조사 : " + TestTV.getCompany());
    }
}
