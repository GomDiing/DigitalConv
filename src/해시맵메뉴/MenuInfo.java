package 해시맵메뉴;

// HashMap에서 사용할 Class
public class MenuInfo {
    String name; // 메뉴 이름
    int price; // 메뉴 가격
    String group; // 분류
    String desc; // 설명

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
}
