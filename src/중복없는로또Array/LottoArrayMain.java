package 중복없는로또Array;

/*
 * ArrayList로 중ㅂ고없는 로또번호 만들기
 * contains() : 리스트안에 해당 값이 있는지 확인
 */

import java.util.ArrayList;
import java.util.List;

public class LottoArrayMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int tmp = 0;
        while (true) {
            tmp = (int)((Math.random() * 45) + 1);
            if (!list.contains(tmp)) {
                list.add(tmp);
            }
            if (list.size() == 6) break;
        }

        for (Integer e : list) System.out.print(e + " ");
    }
}
