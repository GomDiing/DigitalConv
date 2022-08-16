package 캘린더연습;
/*
 * Calendar Class : 정적 메소드인 getInstance()를 이용하여
 * 현재 운영체제에 설정된 시간을 기준으로 Calendar 하위 객체를 얻을 수 있다
 * Abstract Class 임으로 new 키워드를 사용해 객체를 생성할 수 없습니다.
 * (이유는 각 나라마다 날짜 및 시간을 표시하는 방법이 다르기 때문)
 * 포함된 Field 모두 Class(Static) 변수이다.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain {
    public static void main(String[] args) {
        // getInstace()는 정적메소드임으로 Class 이름을 사용한다
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));
        // MONTH는 배열의 인덱스임으로 실제 월을 푯하려면 1을 더해야함
        /*
        System.out.println(now.get(Calendar.MONTH) + 1);
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.DAY_OF_WEEK));
        System.out.println(now.get(Calendar.AM_PM));
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));
        */

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println("오늘은 " + year + "년" + month + "월" + day + "일입니다");
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년M월d일 입니다");
        System.out.println(sdf.format(nowDate));


    }
}