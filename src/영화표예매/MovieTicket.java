package 영화표예매;
/*
 * 좌석에 대한 영화표 판매하고 총 금액 구하기
 * 좌석은 배열로 총 10개 생성
 * 판매액은 좌석당 12,000원
 * 이미 예약된 좌석은 이미 판매되었다고 표시
 */

import java.util.Scanner;

public class MovieTicket {
    int[] seat = new int[10]; // 배열된 좌석을 10으로 생성
    int ticketPrice;

    public MovieTicket(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // 화면에 선택가능한 좌석 표시, 판매된 좌석은 [v], 판매되지않은 좌석은 [ ]
    void printSeat() {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[v]");
        }
        System.out.println();
    }

    // 좌석을 선택하는 메소드
    void selectSeat() {
        printSeat(); // 현재 좌석 상태를 보여줌
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력하세요 : ");
        int seatPos = sc.nextInt(); // 사용자의 좌석 번호는 배열의 인덱스보다 1 크다
        if (seat[seatPos - 1] == 0) { // 아직 판매되지 않은 좌석
            seat[seatPos - 1] = 1;  // 판매된 좌석으로 변경
            printSeat();
        } else System.out.println("이미 판매된 좌석입니다. 다른 좌석을 선택하세요.");
    }

    int totalAmount() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt++;
        }
        return cnt * ticketPrice;
    }
}
