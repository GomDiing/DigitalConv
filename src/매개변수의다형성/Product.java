package 매개변수의다형성;

public class Product {
    int price;
    int bonusPoint;
}

class TV extends Product {
    TV() {
        this.price = 1000;
        this.bonusPoint = 10;
    }
}

class Computer extends Product {
    Computer() {
        this.price = 100;
        this.bonusPoint = 10;
    }
}

class Audio extends Product {
    Audio() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        money -= p.price;
        bonusPoint += bonusPoint;
    }

    void viewInfo() {
        System.out.println("잔액 : 580");
        System.out.println("포인트 : 42");
    }
}
