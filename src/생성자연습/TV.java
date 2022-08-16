package 생성자연습;

public class TV {
    private boolean isON;
    private int channel;
    private int volume;


    TV() { // 기본 생성자 호출
        isON = false;
        channel = 10;
        volume = 10;
    }

    TV(boolean isON) {
        this.isON = isON;
        this.channel = 20;
        this.volume = 20;
    }
    public void setOn(boolean isON) {
        this.isON = isON;   // this는 자신의 객체를 참조하는 변수
        String onOFFStr = (this.isON) ? "ON" : "OFF";
        System.out.println("전원이 " + onOFFStr + "했습니다.");
    }

    // 채널 설정 기능
    public void setChannel(int cnl) {
        if (cnl > 0 && cnl < 1000) {
            channel = cnl;
            System.out.println("채널을 " + channel + "변경 했습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    // 볼륨 설정 기능
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "로 변경했습니다.");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }

    public void viewTV() {
        setOn(isON);
        setChannel(channel);
        setVolume(volume);
    }
}