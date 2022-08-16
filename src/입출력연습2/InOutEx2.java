package 입출력연습2;
// 정수 n을 입력받아 n=n 크기의 행력을 출력하는 프로그램 작성

// Scanner 클래스 : 표준 입력 클래스, java.util 패키지에 있음
// 클래스이름 참조자이름(객체이름) = new 클래스이름(System.in);
import java.util.Scanner;

public class InOutEx2 {
    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = in.nextInt();
        for (int i=1; i<=n*n; i++) {
            System.out.printf("%4d", i);
            if (i % n == 0) System.out.println();
        */

        /*
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(); //-128 ~ 127
        short b = sc.nextShort(0);
        int c = sc.nextInt();
        long d = sc.nextLong();
        char ch = sc.next().charAt(0);  // 문자열을 입력받아 첫번째 문자 추출
        float e = sc.nextFloat();
        double f = sc.nextDouble();
        boolean g = sc.nextBoolean();
        String h = sc.next();   // 문자열을 입력받는데 공백이입력되면 그만 받음
        String i = sc.nextLine();   // 줄바꿈 (개행문자)
    */
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("회원정보를 출력하시겠습니까? [yes/no] : ");
        String isPrint = sc.next();

        if (isPrint.equalsIgnoreCase("yes")) {
            System.out.println("======== 회원 정보 ========");
            System.out.println("이름 : " + name);
            System.out.println("주소 : " + addr);
            System.out.println("성별 : " + gender);
            System.out.println("나이 : " + age);
        }
        else {
            System.out.println("출력 안함");
        }
    }
}
