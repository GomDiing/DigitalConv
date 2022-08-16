package 주민등록번호;

/*
 * 주민등록번호 : 010222-3164414
 * 생년월일 , 나이(만 나이), 성별 (8번째자리 1, 3이면 남성, 2, 4이면 여성
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class JuminMainEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 주민등록번호 입력받기
        System.out.print("주민등록번호 입력 : ");
        String jumin = sc.next();
        // 현재 연도 구하기
        Calendar now = Calendar.getInstance();
        int thisYear = now.get(Calendar.YEAR);
        int jYear = 0, jMonth = 0, jDay = 0, jGender = 0;
        // 주민등록번호 길이만큼 반복문을 돌면서 연/월/일/성별 추출
        for (int i = 0; i < jumin.length(); i++) {
            int tmp = jumin.charAt(i) - '0';
            if (i == 0) jYear = tmp * 10; // 10의 자리 정수
            if (i == 1) jYear += tmp;
            if (i == 2) jMonth = tmp * 10;
            if (i == 3) jMonth += tmp;
            if (i == 4) jDay = tmp * 10;
            if (i == 5) jDay += tmp;
            if (i == 7) jGender = tmp;
        }

        if (jGender == 1 || jGender == 2) {
            System.out.println("생년월일 : " + (jYear + 1900) + "년" +
                    jMonth + "월" + jDay + "일");
            System.out.println("나이 : 만  " + (thisYear - 1900 - jYear) + "세");
        } else {
            System.out.println("생년월일 : " + (jYear + 2000) + "년" +
                    jMonth + "월" + jDay + "일");
            System.out.println("나이 : 만  " + (thisYear - 2000 - jYear) + "세");
        }

        String[] genderStr = {"", "남성", "여성", "남성", "여성"};
        System.out.println("성별 : " + genderStr[jGender]);

//        mySolve();
    }


    /*
    static void mySolve() {
        System.out.print("주민등록번호를 입력하세요 : ");
        Map<String, JuminNumber> map = new HashMap();
        Scanner sc = new Scanner(System.in);
        String juminNumber = sc.next();
        Date date = new Date();

        String birthDay = juminNumber.split("-")[0];
        String juminLater = juminNumber.split("-")[1];
        String birthDayYear = birthDay.substring(0,2);
        String birthDayMonth = birthDay.substring(2,4);
        String birthDayDay = birthDay.substring(4, 6);

        String firstYear = "";
        if (Integer.parseInt(birthDayYear) > 22) firstYear = "19";
        else firstYear = "20";
        System.out.println(firstYear + birthDayYear + "년 " + birthDayMonth + "월 " +  birthDayDay + "일");

        char gender = juminLater.charAt(0);
        if (gender == '1' || gender == '3') System.out.println("남성");
        else if (gender == '2' || gender == '4') System.out.println("여성");
        else System.out.println("성별 알 수 없음");

        SimpleDateFormat dateFormatYear = new SimpleDateFormat("yyyy");
        SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MM");
        int currentYear = Integer.parseInt(dateFormatYear.format(date));
        int currentMonth = Integer.parseInt(dateFormatMonth.format(date));
        int birthDayTotalYear = Integer.parseInt(firstYear + birthDayYear);
        int age = currentYear - birthDayTotalYear;
//        System.out.println(currentMonth);
        if (currentMonth < Integer.parseInt(birthDayMonth)) age--;
        System.out.println("나이 : " + age);

    }
    */
}


