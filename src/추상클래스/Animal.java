package 추상클래스;
/*
 * 추상클래스를 만들기위해서는 class 이름앞에 abstract 키워드 필요
 */

public abstract class Animal {
    abstract void cry(); // 선언만있고 구현부가 없어야함.
}

class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("냐옹냐옹");
    }
}

class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("멍멍!!!");
    }
}
