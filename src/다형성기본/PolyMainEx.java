package 다형성기본;
/*
 * 다형성 : 객체지향 프로그램의 핵심 문법이다.
 * 한 가지 이름으로 여러가지 메소드를 처리가능 (오버로딩)
 * 여러가지 타입을 한 가지 타입으로 처리할 수 있는 기술을 의미
 * 즉, 부모클래스의 타입의 참조 변수로 자식클래스의 인스턴스 객체를 참조할 수 있다
 */

public class PolyMainEx {
    public static void main(String[] args) {
        Child c = new Child(); // 자식클래스의 참조변수로 자식 객체를 접근
        c.display();
        c.out();
        System.out.println();

        Parent p = new Child(); // 부모클래스의 참조변수로 자식객체 접근가능
        // 부모와 자식 클래스 모두 display() 메소드가 있지만
        // Child 클래스를 참조했음으로 Child의 display 출력
        p.display();
        // p,out(); : 없다
        ((Child)p).out();
    }
}

