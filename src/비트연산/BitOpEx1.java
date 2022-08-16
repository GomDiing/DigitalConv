package 비트연산;

// 비트 연산이란? : 0과 1로 구성된 1개의 비트끼리 연산을 수행
// & : bit And, 값이 둘 다 1이면 1
// | : bit Or, 둘 중 하나만 1이면 1
// ^ : XOR, 두 개의 비트값이 다르면 1, 같으면 0
// ~ : 비트를 반전 (0이면 1, 1이면 0)
// << : 왼쪽으로 지정된 수만큼 비트를 이동시킴
// >> : 오른쪽으로 지정된 수만큼 비트를 이동시킴

public class BitOpEx1 {
    public static void main(String[] args) {
        int num1 = 10;  //  00001010
        int num2 = 12;  //  00001100

        System.out.println(num1 & num2);
        System.out.println(Integer.toBinaryString(num1 & num2));
        System.out.println(num1 | num2);
        System.out.println(Integer.toBinaryString(num1 | num2));
        System.out.println(num1 ^ num2);
        System.out.println(Integer.toBinaryString(num1 & num2));
        System.out.println(~num1);
        System.out.println(Integer.toHexString(~num1));
    }
}
