package 매개변수의다형성;

public class Driver {
    String name;

    public Driver(String name) {
        this.name = name;
    }

    void drive(Vehicle vehicle) {
        System.out.print(name + "의 ");
        vehicle.run();
    }

    void drive() {
        System.out.println("차량이 달립니다.");
    }
}
