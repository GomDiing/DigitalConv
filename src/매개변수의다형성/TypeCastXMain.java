package 매개변수의다형성;
// 매개변수 다형성 X, 오버로딩을 구현
public class TypeCastXMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        buyer.buy(tv);
        buyer.buy(audio);
        buyer.buy(computer);
        buyer.viewInfo();

    }
}
