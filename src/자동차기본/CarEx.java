package 자동차기본;

public class CarEx {
    static String serialNumber;
    private String name;    // 차의 이름
    private String color;   // 차의 색상
    private int productYear;    // 제조년도
    private int horsePower;     // 마력
    private int maxSpeed;       // 최고 속도

    /* 생성자 자동 생성
     * 생성자는 클래스가 객체로 만들어 질 때 자동으로 호출됨
     * 클래스가 객체로 만들어 질 때 필드 변수를 초기화하거나 초기동작 등을 수행함
     */

    public CarEx() {
        this.name = "없음";
        this.color = "없음";
        this.productYear = 1970;
        this.horsePower = 0;
        this.maxSpeed = 0;
    }
    public CarEx(String name, String color, int productYear, int horsePower, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.productYear = productYear;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void viewCar() {
        System.out.println("이름 : " + name);
        System.out.println("색상 : " + color);
        System.out.println("연식 : " + productYear);
        System.out.println("마력 : " + horsePower);
        System.out.println("최고속도 : " + maxSpeed);
    }

}
