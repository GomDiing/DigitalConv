package 직렬화메뉴쓰기;

import java.io.Serializable;

/*
 * 직렬화할 Class
 * transient 키워드를 사용하면 직렬화에서 제외된다
 */

public class CoffeeMenuInfo implements Serializable {
    private String name; // 메뉴 이름
    private int price; // 가격
    private String gorup; // 분류
    private String desc; // 설명

    public CoffeeMenuInfo(String name, int price, String gorup, String desc) {
        this.name = name;
        this.price = price;
        this.gorup = gorup;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGorup() {
        return gorup;
    }

    public void setGorup(String gorup) {
        this.gorup = gorup;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
