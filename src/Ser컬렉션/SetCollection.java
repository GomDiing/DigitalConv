package Ser컬렉션;

import java.util.Arrays;
import java.util.HashSet;

public class SetCollection {
    public static void main(String[] args) {
        String[] str = {"H", "e", "l", "l", "o"};
        HashSet<String> set = new HashSet<>();
        /*
        HashSet<String> set = new HashSet<>(Arrays.asList(str));
        System.out.println(set);
        */
        /*
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java");
        for (String e : set) {
            System.out.println(e + " ");
        }
        System.out.println(set.size());
        */

        while (true) {
            int val = (int)(Math.random() * 45) + 1;
            set.add(String.valueOf(val)); // set은 중복된 값을 허용하지 않음
            if (set.size() == 6) break;
        }
        System.out.println(set);
    }
}
