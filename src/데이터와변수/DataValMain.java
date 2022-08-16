package 데이터와변수;

import java.util.Scanner;

// stack - heap - method
// stack은 자동으로 지워진다
public class DataValMain {
    public static void main(String[] args) {
        /*
        // camel 표기법 : taxRate
        // snake 표기법 : tax_rate
        // Pascal 표기법 : TaxRate : 클래스 이름과 겹치기에 변수이름으로 사용하지 않는다
        boolean flag = false;   // true와 false만 올 수 있음
        char grade = 'A';       // 반드시 작은 따옴표를 사용
        //String gradeS = "A";    // 큰 따옴표를 사용
        byte value = 127;       // -128 ~ 127
        short sVal = 32000;     //
        int num = 125000;       //
        long price = 200; //
        float tax = 3.33f;      //
        double score = 3.33;    //

        System.out.println(flag);
        System.out.println(grade);
        //System.out.println(gradeS);
        System.out.println(value);
        System.out.println(sVal);
        System.out.println(num);
        System.out.println(price);
        System.out.println(tax + price);
        System.out.println(score + price);
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); // 스캐너로부터 정수를 입력받아서 age 볂수에 대입
        age = age + 1000;
        System.out.println("당신의 나이는 " + age + "입니다.");
         */

        /*
        괄호에 대해서 : []대괄호는 배열을 의미, {}중괄호는 메소드나 클래스의 범위
        () 소괄호는 메소드의 매개변수 목록을 넣는 부분
        상수 : 상수는 값이 한 번 정해지면 변경이 불가능한 변수를 의미 (final)
        타입 변환 : 하나의 타입을 다른 타입으로 변환하는 것
        정수형을 문자형으로 변경하는 것
        실수와 정수 사이의 형변환
        */

        /*
        double taxRate = 0.10;  // 세율을 의미
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 수입을 입력하세요: ");
        int income = sc.nextInt();
        // taxRate = 0.09;
        System.out.printf("당신이 내야 할 세금은 %.2f\n", income*taxRate);
    */
        /*
        int kor, eng, mat, total;
        double aver;    //  평균을 저장할 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 성적 입력 : ");
        kor = sc.nextInt();
        System.out.println("영어 성적 입력 : ");
        eng = sc.nextInt();
        System.out.println("수학 성적 입력 : ");
        mat = sc.nextInt();

        total = kor + eng + mat;
        //aver = (double)(kor + eng + mat) / 3;
        aver = (double)total / 3;

        //System.out.println("평균 : " + aver);
        String strX = "100";
        int x = Integer.parseInt(strX);
        System.out.printf("x : %d\n", x);

        String strY = "100.33";
        double dX = Double.parseDouble(strY);
        System.out.printf("y : %.2f\n", dX);
*/
        int var1 = 0b1010;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);

    }
}

