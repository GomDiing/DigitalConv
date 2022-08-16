package OctaBinary;

import java.util.Arrays;
import java.util.Scanner;

public class OctaBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octaN = sc.nextInt();
        int octaNLength = String.valueOf(octaN).length();
        String result = "";
        for (int i = 0; i < octaNLength; i++) {
            int c = (Integer.toString(octaN).charAt(i)) - '0';
            String temp = octaToBinary(c);
            result += revStr(temp);
        }
        System.out.println(result);
    }

    public static String octaToBinary(int n) {
        int m = n;
        int len = 3;
        String result = "";
        for (int i = 0; i< len; i++) {
            int remain = m % 2;
            int quo = m / 2;
            result += remain;
            m = quo;
        }
        return result;
    }

    public static String revStr (String s) {
        String result = "";
        char[] arr = s.toCharArray();
        //Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(String.valueOf(arr));

        sb.reverse();
        result = sb.toString();
        return result;
    }
}
