package 아이패드주문하기;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            iPad ipad = new iPad("iPad");
            if (!ipad.choiceiPad()) break;
            ipad.setScreen();
            ipad.setColor();
            ipad.setMemory();
            ipad.setNetwork();
            ipad.setName();
            ipad.setSerial();
            ipad.setProgress();
            ipad.makeiPad();
        }
    }
}
