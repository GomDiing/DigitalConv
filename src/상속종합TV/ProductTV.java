package 상속종합TV;

public class ProductTV extends PrototypeTV {
    String name;
    boolean isInternet; // 인터넷 모드 추가

    ProductTV() {
        super(false, 3, 30); // 부모의 생성자 호출
    }
    ProductTV(String name) {
        // 부모의 생성자를 먼저 진행하고(super) 후에 자식생성자 진행(this)
        super(false, 3, 30); // 부모의 생성자 호출
        this.name = name;
    }

    void setPower(boolean power) {
        this.isPower = power;
    }

    void setVolume(int vol) {
        if (vol>= 0 && vol <= 100) volume = vol;
        else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }

    @Override
    public void setChannel(int cnl) {
        if (cnl > 0 && cnl < 1000)
            System.out.println("채널을 " + channel + "로 변경했습니다.");
        else System.out.println("채널 설정 범위가 아닙니다.");
    }
    // 오버로
    public void setChannel(int cnl, boolean internet) {
        if (internet) {
            System.out.println("인터넷모드입니다.");
            isInternet = true;
        } else {
            isInternet = false;
            if (cnl > 0 && cnl < 1000)
                System.out.println("채널을 " + channel + "로 변경했습니다.");
            else System.out.println("채널 설정 범위가 아닙니다.");
        }
    }

    public void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 : " + isInternet);
    }


}
