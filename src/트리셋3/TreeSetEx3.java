package 트리셋3;

import java.util.TreeSet;

public class TreeSetEx3 {
    public static void main(String[] args) {
        TreeSet<CarComp> treeSet = new TreeSet<>();
        treeSet.add(new CarComp("싼타페", 2016, "흰색"));
        treeSet.add(new CarComp("쏘렌토", 2012, "은색"));
        treeSet.add(new CarComp("그랜저", 2018, "블랙"));

        for (CarComp carComp : treeSet) {
            System.out.print(carComp.modelName + " ");
        }
    }

}
