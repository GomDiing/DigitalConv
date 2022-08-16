package 회원정보만들기;
// 이름(문자열), 나이(정수), 성별(문자), 직업(정수)
// 나이를 입력 받기 : 1 ~ 199 사이 입력
// 성별은 'm', 'M', 'f', 'F'
// 회원정보 전체출력

import java.util.Scanner;

public class Member {
    private String name;
    private int age;
    private char gender;
    private int jobs;

    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        this.name = sc.next();
    }

    public void setAge() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("나이를 입력하세요: ");
            age = sc.nextInt();
            if (age > 0 && age < 200)   return;
            System.out.println("나이를 잘못 입력했습니다.");
        }
    }

    public void setGender () {
        Scanner sc = new Scanner(System.in);
        /*
        gender = sc.next().charAt(0);   // 문자열에서 0번째 글자 추출
        switch(gender) {
            case 'M': case'm':
                System.out.println("남성 입니다.");
                return;
            case 'F': case'f':
                System.out.println("여성 입니다.");
                return;
            default:
        }
       */
        System.out.print("성별을 입력하세요 : ");
        while(true) {
            gender = sc.next().charAt(0);
            switch(gender) {
                case 'M': case 'm': case 'F': case 'f': return;
                default :
                    System.out.println("성별을 잘못 입력하였습니다.");
            }
        }
    }

    public void setJobs() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("직업을 입력하세요 : ");
            jobs = sc.nextInt();
            if (jobs > 0 && jobs < 5) break;
            else System.out.print("직업이 잘못 입력되었습니다.");
        }
    }

    public int getGenderType() {
        if (gender == 'M' || gender == 'm') return 1;
        else return 2;
    }

    public void viewInfo() {
        final String[] genderStr = {"", "남성", "여성"};
        final String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("======= 회원 정보 ======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobStr[jobs]);
    }
}
