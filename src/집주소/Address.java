package 집주소;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int[] size = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};

        while (true) {
            result = 0;
            String n = sc.nextLine();
            if (n.equals("0")) break;
            for (int i = 0; i < n.length(); i++) {
                // result += size[n.charAt(i) - '0'] + 1;
                int x = (n.charAt(i) - '0');
                switch (x) {
                    case 0: result += 4 + 1; break;
                    case 1: result += 2 + 1; break;
                    case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                        result += 3 + 1; break;
                }
            }
            System.out.println(result + 1);
        }
    }
}
