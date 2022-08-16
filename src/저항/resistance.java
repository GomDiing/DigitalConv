package 저항;

import java.util.Scanner;

public class resistance {
    static final int COUNT = 3;

    public static void main(String[] args) {
        // 컬러값에 대한 문자열 배열 선언
        String[] color = {"black", "brown", "red", "orange", "yellow", "green",
                "blue", "violet", "grey", "white"};

        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000,
                10000000, 100000000, 1000000000};
        int firstIdx = 0, secondIdx = 0, thirdVal = 0;
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thirdColor = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            if(firstColor.equals(color[i])) firstIdx = i;
            if(secondColor.equals(color[i])) secondIdx = i;
            if(thirdColor.equals(color[i])) thirdVal = i;
        }

        System.out.println((long)((firstIdx * 10) + (secondIdx) * thirdVal));


    }

    public void mySolve() {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green",
                "blue", "violet", "grey", "white"};

        String[] inputStr = new String[COUNT];
        int[] calcPos = new int[COUNT];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<COUNT; i++) inputStr[i]=sc.next();

        for(int i = 0; i<COUNT;i++) {
            for (int j = 0; j < color.length; j++) {
                if (inputStr[i].equals(color[j])) calcPos[i] = j;
            }
        }

        int thirdNum = 1;
        for(
        int i = 0; i<calcPos[2]; i++) thirdNum *= 10;

        //System.out.println((calcPos[0] * 10 + calcPos[1]) * thirdNum);
        System.out.println((calcPos[0]*10+calcPos[1])*thirdNum);
    }
}
