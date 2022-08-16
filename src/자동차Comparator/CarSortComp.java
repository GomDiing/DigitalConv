package 자동차Comparator;

import java.util.Comparator;

public class CarSortComp implements Comparator<CarSortInfo> {
    @Override
    public int compare(CarSortInfo o1, CarSortInfo o2) {
        /* 연식 정렬
        if (o1.productYear == o2.productYear) return 0;
        else if (o1.productYear < o2.productYear) return -1;
        else return 1;
        */

        // 이름
        return o1.carName.compareTo(o2.carName);
    }

    @Override
    public Comparator<CarSortInfo> reversed() {
        return Comparator.super.reversed();
    }
}
