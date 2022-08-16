package 문자열분리;

import 상속어드밴스.Car;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * StringTokenizer Class : 특정 구분자로 연결되어있는 경우
 * 구분자 기준으로 문자열을 자름 (String의 split 메소드와 유사함)
 * countToken() : 꺼내지않고 남아있는 토큰의 수
 * hasMoreTokens() : 남아있는 토큰이 있는지 여부 확인
 * nextTorken() : 토큰을 하나씩 꺼내옴
 */
public class StringSplit {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 연속 입력 : ");
        String names = sc.next();
        StringTokenizer st = new StringTokenizer(names, "/");
        String[] nameStr = new String[st.countTokens()];

        int idx = 0;
        while (st.hasMoreTokens()) {
            nameStr[idx++] = st.nextToken();
        }

        for (String e : nameStr) {
            System.out.print(e + " ");
        }

        System.out.println();


         */
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 , 기준으로 연속 입력 : ");
        String names = sc.nextLine();

        /*
        String[] nameStr = names.split(",");
        for (int i = 0; i < nameStr.length; i++)  {
            System.out.print(i + "번째" + nameStr[i] + " ");
        }
        System.out.println();
        */

        StringTokenizer st = new StringTokenizer(names, ",");
        for (int i = 0; st.hasMoreTokens(); i++) {
            System.out.print(i + "번째" + st.nextToken() + " ");
        }

        Car car = new Car();
        Class cls = car.getClass(); // Class 클래스
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName()); // 패키지 이름과
        System.out.println(cls.getSuperclass());
        System.out.println(cls.getPackage().getName());
    }
}
