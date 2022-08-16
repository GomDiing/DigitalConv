package 제네릭타입;

public class GenericMain {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("고유림");
        Person<Integer> p2 = new Person<>(27);

        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("스마트 TV");
        pr1.setYear(2022);
        System.out.println(pr1.getname());
        System.out.println(pr1.getYear());
        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(12345);
        pr2.setYear("2022년8월5일");
        System.out.println(pr2.getname());
        System.out.println(pr2.getYear());

    }
}

/*
 * T(타입 변수)는 예약어는 아니고 관례상 사용
 * 타입 변수란? 임의의 참조형 타입
 */
class Person<T> {
    public T info;

    Person(T info) {
        this.info = info;
    }
}

class Product<T, M> {
    private T name;
    private M year;

    public T getname() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M Year) {
        this.year = year;
    }
}

class SUM <T, M, N> {
    private T val1;
    private M op;
    private N val2;

}