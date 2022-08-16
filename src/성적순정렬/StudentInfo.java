package 성적순정렬;

/*
 * 1. 이름과 성적에 대한 Instance Field 생성
 * 2. 검색을 위한 Comparable Interface 상속을 받아서 구현 (Class 대한 정렬 기준을 정함)
 * Interface 상속은 반드시 Method 구현해줘야함.
 */
public class StudentInfo implements Comparable<StudentInfo> {
    public String name; // 학생의 이름
    public int score; // 학생의 성적

    // 생성자 만들기 : Instance Field 에 초기값을 넣어줌
    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        /* 성적 순 정렬
        if (this.score == o.score) return 0; // 정렬 조건이 아님
        else if (this.score > o.score) return -1; // 내림차순 조건이 아님, 정렬 안함
        else return 1; // 정렬 조건 성립, 즉 뒤에 값을 swap (위치를 바꿈)
        */

        // 이름 순 정렬
//        if (this.name.compareToIgnoreCase(o.name) == 0) return 0;
//        else if (this.name.compareToIgnoreCase(o.name) < 0 ) return 1;
//        else return -1;
        return this.name.compareToIgnoreCase(o.name);
    }
}
