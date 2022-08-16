package 상속종합TV;
// 상속, 오버라이딩, 오버로딩, super() 복습
// 상속 : PrototypeTV로부터 상속받아서 ProductTV를 만듬
// 오버라이딩 : 채널 설정을 499개에서 999개로 변경함 (부모 메소드의 재정의)
// 오버로딩 : 채널 설정을 오버로딩해서 인터넷모드를 추가함
// ->동일 메소드를 매개변수의 개수나 타입으로 다르게 자동 호출함
// ProductTV 생성자 호출 시 부모의 생성자를 호출함 (super())

public class TvUpgradeMain {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집TV");
        lgTV.setPower(true);
        lgTV.setVolume(45);
        lgTV.setChannel(3, true);
        lgTV.viewTV();
    }
}