package 상근이알람;

// 상근이 알람 설정하기
// 24시간제이고 일렵받은 시간에서 48분빼서 시간을 설정
// 힌트 : 시간을 분으로 환산해서 계산하고 다시 시간과 분으로 변경
// 0:30과 같은 경우 고민(???) if문으로 처리가 가능
// 필요 문법 : 나머지 연산자, 나눗셈 연산자, 조건문
// 출력은 시간과 분으로 출력

import java.util.Scanner;

public class AlarmEx1 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        int alarmTime = 45;
        String toDate = "오늘 ";

        int minute, hour, cvtTime, rstTime;
        do {
            System.out.print("시(Hour)를 입력하세요 : ");
            hour = sc.nextInt();
            System.out.print("분(Minute)를 입력하세요 : ");
            minute = sc.nextInt();

            if (hour > 24 || hour < 0) {
                System.out.println("제대로 입력된 값이 아닙니다. (Hour).");
                System.out.println("다시 입력하십시오");
            } else if (minute > 60 || minute < 0) {
                System.out.println("제대로 입력된 값이 아닙니다. (Minute)");
                System.out.println("다시 입력하십시오");
            }
            *//*
            else if (hour == 0 && minute < alarmTime) {
                System.out.println("0시 이전으로 알람이 설정될 수 없습니다.");
                System.out.println("다시 입력하십시오");
            }
            *//*
            else
                break;
        } while (true);

        cvtTime = (hour * 60) + minute;
        rstTime = cvtTime - alarmTime;
        if (rstTime < 0) {
            rstTime = (24*60) + rstTime;
            toDate = "전날 ";
            //System.out.println("0시 이전으로 설정되었습니다 오류가 발생했습니다.");
        }
        System.out.println("설정된 " + toDate + "알람시간은 " + rstTime / 60 + "시 " + rstTime % 60 + "분입니다.");
    */
        Scanner sc = new Scanner(System.in);
        int hour, min, calc;
        hour = sc.nextInt();
        min = sc.nextInt();
        calc = (hour * 60) + min;
        if (calc < 45)  calc = (24 * 60) + min;
        calc -= 45;
        System.out.println("알람 : " + (calc/60) + "시" + (calc%60) + "분");
    }
}
