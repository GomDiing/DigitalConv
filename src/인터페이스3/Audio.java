package 인터페이스3;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

    }
}
