package 알고리즘_피타고라스;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int max = 0;
        int min1, min2;
        int[] inputNumber = new int[3];
        String input;

        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("0 0 0")) break;
            for (int i = 0; i < 3; i ++) {
                inputNumber[i] = Integer.parseInt(input.split(" ")[i]);
            }

            Arrays.sort(inputNumber);

            /*
            for (int i = 0; i < 3; i++) {
                for (int j = i; j < 3; j++) {
                    if (inputNumber[i] > inputNumber[j]) {
                        int temp = inputNumber[i];
                        inputNumber[i] = inputNumber[j];
                        inputNumber[j] = temp;
                    }
                }
            }
            */

            /*
            if (inputNumber[0] > inputNumber[1]) {
                if (inputNumber[0] > inputNumber[2]) {
                    max = inputNumber[0];
                    min1 = inputNumber[1];
                    min2 = inputNumber[2];
                }
                else {
                    max = inputNumber[2];
                    min1 = inputNumber[0];
                    min2 = inputNumber[1];
                }
            }
            else {
                if (inputNumber[1] > inputNumber[2]) {
                    max = inputNumber[1];
                    min1 = inputNumber[0];
                    min2 = inputNumber[2];
                }
                else {
                    max = inputNumber[2];
                    min1 = inputNumber[0];
                    min2 = inputNumber[1];
                }
            }
            */

//            String result = (max*max == min1*min1 + min2*min2) ? "right" : "false";
            String result
                    = (inputNumber[2]*inputNumber[2])
                    == (inputNumber[0]*inputNumber[0] + inputNumber[1]*inputNumber[1])
                    ? "right" : "false";

            System.out.println(result);
        }
    }
}
