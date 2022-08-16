package 열거형연습;

public class Common {
    // 직업
    interface Jobs {
        int STUDENT = 1; // public static final
        int WORKER = 2;
        int HOUSEWIFE = 3;
        int NONE = 4;
   }

    // 취미
    interface Hobby {
        int BASEBALL = 1; // public static final
        int SOCCER = 2;
        int SING = 3;
        int NONE = 4;
    }

}

enum Gender {
    MALE, FEMALE
}

enum Job {
    STUDENT, WORKER, HOUSEWIFE, NONE
}

enum Addr {
    SEOUL, KYUNGKI, INCHUN, SUWON
}

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, PURPLE
}