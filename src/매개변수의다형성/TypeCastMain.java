package 매개변수의다형성;

import java.util.Scanner;

public class TypeCastMain {
    public static void main(String[] args) {
        Driver driver = new Driver("우영우");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Truck truck = new Truck();
        SportsCar sportsCar = new SportsCar();

        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 [1]버스 [2]택시 [3]스포츠카 [4]트럭 : ");
        int selectCar = sc.nextInt();

        switch (selectCar) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi);break;
            case 3 : driver.drive(sportsCar);break;
            case 4 : driver.drive(truck);break;
            default: driver.drive(); break;
        }
    }
}
