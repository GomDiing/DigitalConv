package 클래스기본;

public class ClassBasicEx {
    public static void main(String[] args) {
        Student student1 = new Student(100);
        Student student2 = new Student(200);
        Student student3 = new Student(300);

        student1.testPrn();
        student2.testPrn();
        student3.testPrn();

        System.out.println(Student.cnt);
    }
}

// 기본 클래스 생성 : class 키워드로 클래스 생성
// 클래스 이름은 대문자로 시작한다.

class Student {
    int value; // 인스턴스 필드
    static int cnt = 0; // 정적 변수
    // 생성자 : 생성자는 클래스가 객체로 만들어 질때 호출됨
    Student(int value) {
        this.value = value;
    }
    // 메서드 생성
    void testPrn() {
        int tmp = 100;
        value += tmp;
        System.out.println(value + ", " + "기본 클래스의 메소드 호출입니다.");
    }
}
