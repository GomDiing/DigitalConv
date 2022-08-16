package 중첩인터페이스;

public class ComplexInterMain {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setListener(new CallListener());
        btn.touch();
        btn.setListener(new MessageListener());
        btn.touch();
    }
}
