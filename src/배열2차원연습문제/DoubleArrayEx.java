package 배열2차원연습문제;

public class DoubleArrayEx {
    public static void main(String[] args) {
        double[] avr = {0, 0, 0, 0, 0, 0};
        int[][] student = {
                {1, 66, 77, 89, 0},
                {2, 80, 88, 98, 0},
                {3, 100, 48, 33, 0},
                {4, 87, 98, 23, 0},
                {5, 100, 99, 98, 0},
                {6, 67, 99, 98, 0}
        };

        for (int i = 0; i < student.length; i++) {
            for (int j = 1; j < 4; j++) {
                student[i][4] += student[i][j];
            }
            avr[i] = (double)student[i][4] / 3;
            System.out.printf("%d, %d, %.2f\n", student[i][0], student[i][4], avr[i]);
        }

        int tmp_num = 0;
        int tmp_total = 0;
        double tmp_avr = 0.0;
        System.out.println("학번\t 평점\t 평균");
        System.out.println("--------------------");
        for (int i = 0; i < student.length; i++) {
            for (int j = i; j < student.length; j++) {
                if (student[i][4] < student[j][4]) {
                    tmp_total = student[i][4];
                    student[i][4] = student[j][4];
                    student[j][4] = tmp_total;

                    tmp_num = student[i][0];
                    student[i][0] = student[j][0];
                    student[j][0] = tmp_num;

                    tmp_avr = avr[i];
                    avr[i] = avr[j];
                    avr[j] = tmp_avr;
                }
            }
        }
    }
}
