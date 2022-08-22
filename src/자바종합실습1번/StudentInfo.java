package 자바종합실습1번;

/*
 * Class 정렬을 위해 Comparable 사용
 */

public class StudentInfo implements Comparable<StudentInfo> {

    private String name;
    private int kor;
    private int eng;
    private int mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    int getTotal() {
        return kor + eng + mat;
    }

    String getName() {
        return name;
    }

    @Override
    /*
     * 여기서 정렬 기준에대한 조건 만듬 (총점 높은 사람이 먼저 나오도록)
     * compareTo() : 정수형 값이 반환되고 반환값이 1인 경우 정렬 조건이 성립된다.
     */
    public int compareTo(StudentInfo o) {
        if (this.getTotal() == o.getTotal()) {
            return this.getName().compareTo(o.getName());
        }
        else if (this.getTotal() > o.getTotal()) return -1;
        else return 1; // 자신의 객체의 총점보다 매개변수로 입력된 객체의 총점이 큰 경우
    }
}