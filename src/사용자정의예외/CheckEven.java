package 사용자정의예외;

public class CheckEven {
    private int num;
    public void setNum(int num) {
        this.num = num;
    }

    public int printEven(int number) throws EventException {
        this.num = number;
        if (num % 2 != 0) {
            throw new EventException(num);
        } else {
            return num;
        }
    }
}
