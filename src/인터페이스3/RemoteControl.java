package 인터페이스3;
/*
 * 인터페이스에 포함되는 것들
 * 상수 : 모든 field는 자동으로 상수(final static)로 변환된다
 * 메소드 : 모든 메소드는 추상메소드로 변경된다. (자동으로 abstract 붙는다.)
 * default 메소드 : 구현부를 가짐. 상속받는 클래스가 재정의 사용가능
 * 정적(static) 메소드 : static, 객체와 상관없이 interface 타입으로 사용
 */

public interface RemoteControl {
    int MAX_VOLUME = 100; // 자동으로 final static이 붙는다
    int MIN_VOLUME = 0;
    void turnON(); // 자동으로 abstract가 붙는다
    void turnOFF();
    void setVolume(int volume);
    // default 메소드 : jdk 1.8 이후에 추가됨, default 키워드를 사용함
    default void setMute(boolean mute) {
        if (mute) System.out.println("무음 처리 합니다.");
    }
}
