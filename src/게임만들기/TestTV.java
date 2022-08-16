package 게임만들기;

public class TestTV {
    private final static String company = "LG";
    private boolean isPower;
    public int channel;
    private int volume;
    private int screenRate; // 16:9, 4:3, Auto

    final static String getCompany() {
        return company;
    }

    public TestTV(boolean isPower, int channel, int volume, int screenRate) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
        this.screenRate = screenRate;
    }

    public boolean isPower() {
        return isPower;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getScreenRate() {
        return screenRate;
    }

    public void setScreenRate(int screenRate) {
        this.screenRate = screenRate;
    }
}
