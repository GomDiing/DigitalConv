package 어레이리스트2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain2 {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano", 2000, "Coffee", "커피", true));
        menuList.add(new MenuInfo("Latte", 4000, "Coffee", "우유포함", true));
        menuList.add(new MenuInfo("Black Tea", 4000, "Tea", "홍차입니다.", false));

        for (MenuInfo e : menuList) {
            System.out.println(e.getJsonFormat());
        }

        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(menuList.get(i).getJsonFormat());
        }
    }
}
