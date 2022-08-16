package 객체타입확인;
/*
 * instanceof : 객체 타입을 확인하는 연산자
 * 주로 상속관계에서 부모 / 자식객체 확인
 * 주로 형변환 가능 여부 확인용으로 사용 (true인 경우는 형변환이 가능하단 의미)
 * 왼쪽은 참조변수, 오른쪽은 Class 타입이 온다
 */
public class InstanceMain {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Parent);
    }
}

class Parent {
    String name;
    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    String name;

    public Child(String name) {
        super(name);
    }
}
