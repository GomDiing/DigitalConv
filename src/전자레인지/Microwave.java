package 전자레인지;

import java.util.Scanner;

public class Microwave {
    static final int buttonA = 300;
    static final int buttonB = 60;
    static final int buttonC = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        int n = sc.nextInt();

        if ( n % 10 != 0) System.out.println("-1");
        else {
            a = n / buttonA;
            b = n % buttonA / buttonB;
            c = n % buttonA % buttonB / buttonC;

            System.out.printf("%d %d %d\n",a, b, c);
        }
    }

    public static void mySolve() {
        Scanner sc = new Scanner(System.in);

        int inputTime = sc.nextInt();
        int btACnt = inputTime / buttonA;
        int btAResCnt = inputTime % buttonA;
        int btBCnt = btAResCnt / buttonB;
        int btBResCnt = btAResCnt % buttonB;
        int btCCnt = btBResCnt / buttonC;
        int btCResCnt = btBResCnt % buttonC;

        while (true) {
            if (btAResCnt == 0) {
                System.out.println("총 횟수 : " + btACnt);
                System.out.println("A버튼 : " + btACnt);
                break;
            } else if (btBResCnt == 0) {
                System.out.println("총 횟수 : " + (btACnt + btBCnt));
                System.out.print("A버튼 : " + btACnt);
                System.out.println(", B버튼 : " + btBCnt);
                break;
            } else if (btCResCnt == 0) {
                System.out.println("총 횟수 : " + (btACnt + btBCnt + btCCnt));
                System.out.print("A버튼 : " + btACnt);
                System.out.print(", B버튼 : " + btBCnt);
                System.out.println(", C버튼 : " + btCCnt);
                break;
            } else {
                System.out.println(-1);
                break;
            }
        }
    }
}