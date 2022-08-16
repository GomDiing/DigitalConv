package 생성자연습;
// 생성자 : 클래스가 객체를 만들어 질 때 호출됨
// 클래스와 이름과 동일
// 반환타입이 없다 (void도 안붙인다)
// 하나의 클래스는 여러개의 생성자를 가질 수 있다 (생성자 오버로딩)


public class TVEx1 {
    public static void main(String[] args) {
        /*
        Car car1 = new Car();
        Car car2 = new Car("G80");
        Car car3 = new Car("G90", 2022);
        Car car4 = new Car("G90", "red");
        */

        TV lgtv = new TV();
        lgtv.setOn(true);
        lgtv.setChannel(1000);
        lgtv.setVolume(56);
        lgtv.viewTV();

        TV samTV = new TV(true);
        samTV.viewTV();
    }
}

class Car {
    Car() {
        System.out.println("매개변수가 없는 생성자 호출");
    }

    Car (String modelName) {
        System.out.println(modelName + " 생성자 호출");
    }

    Car (String modelName, int modelYear) {
        System.out.println(modelName + " " + modelYear + " 생성자 호출");
    }
    Car (String modelName, String color) {
        System.out.println(modelName + " " + color + " 생성자 호출");
    }
}
