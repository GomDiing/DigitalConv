package 반복문에대한제어;

public class ForControlEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0) continue;
            if (i == 66) break;
            System.out.println(i);
        }
    }
}
