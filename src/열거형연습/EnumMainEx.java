package 열거형연습;

import java.util.Calendar;
import java.util.Scanner;
// values() : 열거체의 모든 상수를 저장한 배열을 생성하여 반환합니다
// vlaueOf() : 전달된 문자열과 일치하는 해당 열거체 상수를 반환

public class EnumMainEx {
    public static void main(String[] args) {
    /*
        MemberInfo member = new MemberInfo();
        member.name = "우영우";
        member.gender = Gender.FEMALE;
        member.job = Job.STUDENT;
        member.addr = Addr.KYUNGKI;

        System.out.println("이름 : " + member.name);
        System.out.println("성별 : " + member.gender);
        System.out.println("직업 : " + member.job);
        System.out.println("주소 : " + member.addr);
    */

        Week today = null;
        // 추상클래스이기때문에 객체를 생성하지 않음
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 1 ~ 7

        switch (week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        Rainbow[] arr = Rainbow.values();
        int index = Rainbow.YELLOW.ordinal();
        System.out.println(index);
    }
}

class MemberInfo {
    String name;
    Gender gender;
    Job job;
    Addr addr;
}




