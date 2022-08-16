package 아이패드주문하기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/*
 * 1. 사용자가 공홈을 통해서 제품 구매를 한다.
 * 2. 화면 크기 11인치와 12.9인치
 * 3. 컬러는 스페이스그레이와 실버
 * 4. 저장 용량은 128GB, 256GB, 512GB, 1TB
 * 5. 네트워크는 Wi-Fi 모델과 Wi-Fi + Cellular 모델
 * 6. 각인 서비스지원으로 이름을 입력 할 수 있음
 * 7. 일련번호는 iPad + 인치 + 메모리 + W/C + 제조일 + 생산댓수
 * iPad + 11/13 + 128/256/512/1024 + W/C + 220801 + 생산댓수
 * 예) iPad11256W2201061 (제품명 + 화면크기+용량+네트워크+출시일+생산댓수)
 * 일련번호란? 제품에 대한 고유 번호를 의미하며, 중복된 번호가 존재할 수 없는 유일한 식별자 이다.
 */
public class iPad {
    final String[] scrnSerial = {"11", "13"};
    final String[] memoSerial = {"128", "256", "512", "1024"};
    final String[] netSerial = {"W", "C"};
    final String[] networks = {"Wi-Fi", "Wi-Fi + Cellular"};
    final String[] colors = {"스페이스 그레이", "실버"};
    final String[] memorys = {"128GB", "256GB", "512GB", "1TB"};
    int screen; // 화면 크기 : 11인치(1)와 12.9인치(2)
    int color; // 컬러 : 스페이스 그레이(1), 실버(2)
    int memory; // 용량 : 128GB(1), 256GB(2), 512GB(3), 1TB(4)
    int network; // 네트워크 : Wi-Fi(1), Wi-Fi + Cellular(2)
    String name; // 각인서비스 이름
    String nowDate;
    String serial; // 제품 고유넘버
    static int cnt = 0; // 몇대 제작되었는지 확인
    Scanner sc = new Scanner(System.in);
    iPad(String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        nowDate = sdf.format(now);
        cnt++;
        nowDate = nowDate + cnt;
    }

    // iPad 구입 선택 메뉴
    boolean choiceiPad() {
        String input;
        System.out.println("iPad 구입하기");
        System.out.print("계속 진행하시려면 yes / 그만두시려면 quit을 입력하세요 : ");
        input = sc.nextLine();
        if (input.equalsIgnoreCase("quit")) return false;
        else return true;
    }

    // screen 선택 메뉴
    void setScreen() {
        while (true) {
            System.out.println("스크린 크기 선택");
            System.out.print("[1] 11인치 [2] 12.9인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) break;
            else System.out.println("다시 선택하십시오");
        }
    }

    // color 선택 메뉴
    void setColor() {
        while (true) {
            System.out.println("색상 선택");
            System.out.print("[1] 스페이스 그레이 [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) break;
            else System.out.println("다시 선택하십시오");
        }
    }

    // memory 선택 메뉴
    void setMemory() {
        while (true) {
            System.out.println("저장용량 선택");
            System.out.print("[1]128GB [2]256GB [3]512GB [4]1TB : ");
            memory = sc.nextInt();
            if (memory > 4 || memory < 1)
                System.out.println("다시 선택하십시오");
            else break;
        }
    }

    // network 선택 메뉴
    void setNetwork() {
        while (true) {
            System.out.println("네트워크 선택");
            System.out.print("[1]Wi-Fi [2]Wi-Fi + Cellular : ");
            network = sc.nextInt();
            if (network==1 || network == 2) break;
            else System.out.println("다시 선택하십시오");
        }
    }

    // 각인 서비스
    void setName() {
        while (true) {
            String service;
            System.out.println("(옵션) 각인서비스 선택");
            System.out.print("각인 서비스를 신청 하시겠습니까? [yes / no] : ");
            service = sc.next();
            if (service.equalsIgnoreCase("yes")) {
                sc.nextLine();
                System.out.print("각인으로 새길 서명을 입력하세요 : ");
                name = sc.next();
            }
            break;
        }
    }

    // serialNumber 만들기
    void setSerial() {
        serial = "iPad" + scrnSerial[screen - 1] + memoSerial[memory - 1]
                + netSerial[network - 1] + nowDate;
        System.out.println(serial);
    }

    // iPad 출고
    void makeiPad() {
        System.out.println("iPad가 출고되었습니다");
        System.out.println("----------------------");
        System.out.println("화면 크기 : " + scrnSerial[screen - 1] + "인치");
        System.out.println("제품 색상 : " + colors[color - 1]);
        System.out.println("제품 용량 : " + memorys[memory - 1]);
        System.out.println("네트워크 : " + networks[network - 1]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serial);
        System.out.println("----------------------");
    }

    void setProgress() throws InterruptedException {
        int total = 50;
        char defaultChar = '-';
        char icon = '*';

        for (int i = 0; i <= 30; i++) {
            StringBuffer prog = new StringBuffer();
            StringBuffer progRemain = new StringBuffer();
            float progPercent = (float)i / 30 * 100;
            float progConv = progPercent * total / 100;
            int remain = (int)(total - progConv);

            for (int k = 0; k < progConv; k++) {
                prog.append(icon);
            }
            for (int j = 0; j < remain; j++) {
                progRemain.append(defaultChar);
            }
            System.out.print("\r" + "진행률 : " + String.format(
                    "%.3f%%", progPercent)
                    + "\t" + prog + progRemain
            );
            Thread.sleep(1000);
        }
        System.out.println();
    }
}
